package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(", ");
        int count = Integer.parseInt(elements[0]);
        char pattern = elements[1].charAt(0);
        int[][] matrix = new int[count][count];
        int number = 1;

        if (pattern == 'A') {
            methodA(count, matrix, number);
        }
        else if(pattern =='B'){
            methodB(count, matrix, number);
        }
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void methodB(int count, int[][] matrix, int number) {
        for (int col = 0; col < count; col++) {
            for (int row = 0; row < count; row++) {
                if (col % 2 ==0){
                    matrix[row][col] = number;
                }
                else{
                    matrix[count -row - 1][col] = number;
                }
                number++;
            }
        }
    }

    private static void methodA(int count, int[][] matrix, int number) {
        for (int col = 0; col < count; col++) {
            for (int row = 0; row < count; row++) {
                matrix[row][col] = number;
                number++;
            }
        }
    }
}
