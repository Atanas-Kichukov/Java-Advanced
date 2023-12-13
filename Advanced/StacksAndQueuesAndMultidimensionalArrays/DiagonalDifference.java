package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = readArr(scanner, "\\s+");
        }

        int row = 0;
        int col = 0;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        while (row < size && col < size) {
            firstDiagonal += matrix[row][col];
            row++;
            col++;
        }
        for (int index = 0; index < size; index++) {
            secondDiagonal += matrix[(size-1) - index][index];
        }
        int difference =Math.abs(firstDiagonal-secondDiagonal);
        System.out.println(difference);
    }

    public static int[] readArr(Scanner scanner, String separator) {
        return Arrays.stream(scanner.nextLine().split(separator)).mapToInt(Integer::parseInt).toArray();
    }
}
