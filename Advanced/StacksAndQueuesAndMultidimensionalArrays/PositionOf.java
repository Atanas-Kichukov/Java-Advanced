package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int matrix[][] = readMatrix(scanner);
       int number = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int current = matrix[r][c];
                if(current ==number){
                    System.out.println(r + " " + c);

                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[]tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        int [][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = Integer.parseInt(input[c]);
            }
        }
        return matrix;
    }
}
