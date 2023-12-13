package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String [][] matrix = new String[rows][cols];

        char letter = 'a';

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = "" + letter + (char)(letter + col) + letter;
            }
            letter++;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
