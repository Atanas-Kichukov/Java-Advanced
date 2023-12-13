package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int sum = 0;
        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[]matrixElements = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                int numToAdd = Integer.parseInt(matrixElements[col]);
                matrix[row][col] = numToAdd;
                sum += numToAdd;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
