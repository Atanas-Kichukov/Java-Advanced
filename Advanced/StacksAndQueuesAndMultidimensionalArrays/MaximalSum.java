package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]rowsAndCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];
        int maxValue = Integer.MIN_VALUE;
        int [][] maxMatrix = new int[3][3];
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < rows; row++) {
            String[]input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        for (int row = 0; row < rows - 2 ; row++) {
            for (int col = 0; col < cols -2 ; col++) {
            int currentValue = matrix[row][col]+ matrix[row][col + 1]+matrix[row][col+2]
                    + matrix[row + 1][col] +  matrix[row + 1][col + 1] + matrix[row + 1][col+ 2]
                    +matrix [row + 2][col] + matrix [row + 2][col + 1] + matrix[row +2][col + 2];
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        System.out.println("Sum = " + maxValue);
        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2  ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
