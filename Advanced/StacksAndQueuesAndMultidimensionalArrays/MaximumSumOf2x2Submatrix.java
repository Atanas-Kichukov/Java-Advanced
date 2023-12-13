package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int [][] matrix = new int[rows][cols];
        int [][] bestMatrix = new int[2][2];
        int maxValue = Integer.MIN_VALUE;
        for (int row = 0; row < rows; row++) {
            String [] elements = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                int number = Integer.parseInt(elements[col]);
                matrix[row][col] = number;
            }
        }
        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols -1 ; col++) {
                int currentValue = matrix[row][col] + matrix[row][col + 1]
                + matrix[row + 1][col] + matrix[row +1][col + 1];
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                    bestMatrix[0][0] =matrix[row][col];
                    bestMatrix[0][1] =matrix[row][col + 1];
                    bestMatrix[1][0] =matrix[row + 1][col];
                    bestMatrix[1][1] =matrix[row + 1][col + 1];
                }
            }
        }
        for (int row = 0; row < bestMatrix.length; row++) {
            for (int col = 0; col < bestMatrix[row].length; col++) {
                System.out.print(bestMatrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
        
        
    }
}
