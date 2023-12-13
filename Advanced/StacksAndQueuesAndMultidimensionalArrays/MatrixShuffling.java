package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]rowsAndCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        String [][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[]elements = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = elements[col];
            }
        }

        String input = scanner.nextLine();
        while(!input.equals("END")){
            String[]tokens = input.split("\\s+");
            String command = tokens[0];
            if(!command.equals("swap")){
                System.out.println("Invalid input!");
            }
            else{
                int rowFirstWord = Integer.parseInt(tokens[1]);
                int colFirstWord = Integer.parseInt(tokens[2]);
                int rowSecondWord = Integer.parseInt(tokens[3]);
                int colSecondWord = Integer.parseInt(tokens[4]);
                if(isInBounds(rows, cols, rowFirstWord, colFirstWord) &&
                        (isInBounds(rows,cols,rowSecondWord,colSecondWord))) {
                    String firstWord = matrix[rowFirstWord][colFirstWord];
                    String secondWord = matrix[rowSecondWord][colSecondWord];
                    matrix[rowFirstWord][colFirstWord] = secondWord;
                    matrix[rowSecondWord][colSecondWord] = firstWord;
                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("Invalid input!");
                }
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isInBounds(int rows, int cols, int rowFirstWord, int colFirstWord) {
        return rowFirstWord >= 0 && rowFirstWord < rows && colFirstWord >= 0 && colFirstWord < cols;
    }
}
