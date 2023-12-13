package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndCols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rowsAndCols][rowsAndCols];
        List<Integer> fromUpToDown = new ArrayList<>();
        List<Integer> fromDownToUp = new ArrayList<>();

        for (int row = 0; row < rowsAndCols; row++) {
            String []  numbers = scanner.nextLine().split(" ");
            for (int col = 0; col < rowsAndCols; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }

        }
        for (int row = 0; row < rowsAndCols; row++) {
                int element = matrix[row][row];
            System.out.print(element + " ");
        }
        System.out.println();

        for (int row = rowsAndCols - 1; row >= 0; row--) {
            int element = matrix[row][row];
            System.out.print(element + " ");

        }
//        int row = 0;
//        int col = 0;
//        while(row < rowsAndCols && col <rowsAndCols){
//            System.out.println(matrix[row][col]);
//            row++;
//            col++; това се използва да се взимат елементи в правоъгълни матрици по диагонал

//        }
    }
}
