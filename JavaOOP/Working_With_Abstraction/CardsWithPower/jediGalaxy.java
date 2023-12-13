package JavaOOP.Working_With_Abstraction.CardsWithPower;

import java.util.Arrays;
import java.util.Scanner;

public class jediGalaxy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        long gatheredStars = 0;
        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Let the force be with you")) {
            int[] ivoCoordinates = Arrays.stream(command.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int ivoRows = ivoCoordinates[0];
            int ivoCols = ivoCoordinates[1];
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int evilRows = evilCoordinates[0];
            int evilCols = evilCoordinates[1];

            destroyCells(matrix, evilRows, evilCols);
            printMatrix(matrix);
            gatheredStars = getGatheredStars(matrix, gatheredStars, ivoRows, ivoCols);


            command = scanner.nextLine();
        }
    }

    private static long getGatheredStars(int[][] matrix, long gatheredStars, int ivoRows, int ivoCols) {
        while (ivoRows >= 0 && ivoCols < matrix[1].length) {
            if (ivoRows < matrix.length && ivoCols >= 0 && ivoCols < matrix[0].length) {
                gatheredStars += matrix[ivoRows][ivoCols];
            }
            ivoRows--;
            ivoCols++;
        }
        return gatheredStars;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);

            }
            System.out.println();
        }
    }

    public static void fillMatrix(int[][] matrix, int rows, int cols) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }
    }

    public static void destroyCells(int[][] matrix, int evilRows, int evilCols) {
        while (evilRows >= 0 && evilCols >= 0) {
            if (evilRows < matrix.length && evilCols < matrix[0].length) {
                matrix[evilRows][evilCols] = 0;
            }
            matrix[evilRows][evilCols] = 0;
            evilRows--;
            evilCols--;
        }
    }
}
