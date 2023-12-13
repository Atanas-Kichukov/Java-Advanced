package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("[()]");
        int degrees = Integer.parseInt(command[1]) % 360;
        List<String> wordsForMatrix = new ArrayList<>();
        String input = scanner.nextLine();
        int longestWord = input.length();

        while(!input.equals("END")){
            wordsForMatrix.add(input);
            input = scanner.nextLine();
            if(input.length()>longestWord){
                longestWord = input.length();
            }
        }
        char [][] matrix = new char[wordsForMatrix.size()][longestWord];
        readMatrix(wordsForMatrix, longestWord, matrix);
        rotateAndPrintMatrix(degrees, wordsForMatrix, longestWord, matrix);
    }

    private static void readMatrix(List<String> wordsForMatrix, int longestWord, char[][] matrix) {
        for (int row = 0; row < wordsForMatrix.size() ; row++) {
            for (int col = 0; col < longestWord; col++) {
                String word = wordsForMatrix.get(row);
                if(col<word.length()){
               matrix[row][col] = wordsForMatrix.get(row).charAt(col);
                }
                else{
                    matrix[row][col] = ' ';
                }
            }
        }
    }

    private static void rotateAndPrintMatrix(int degrees, List<String> wordsForMatrix, int longestWord, char[][] matrix) {
        if(degrees == 90){
            for (int col = 0; col < longestWord; col++) {
                for (int row = wordsForMatrix.size() -1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
        else if(degrees == 180){
            for (int row = wordsForMatrix.size()- 1; row >=0 ; row--) {
                for (int col = longestWord - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
        else if(degrees == 270){
            for (int col = longestWord - 1; col >= 0; col--) {
                for (int row = 0; row < wordsForMatrix.size(); row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (degrees == 0) {
            for (int row = 0; row < wordsForMatrix.size(); row++) {
                for (int col = 0; col < longestWord; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }
}
