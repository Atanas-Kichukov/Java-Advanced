package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(symbol =='('){
                stack.push(i);
            }
            else if(symbol ==')'){
                int openingIndex = stack.pop();
               int closingIndex = i + 1 ;
                System.out.println(expression.substring(openingIndex,closingIndex));
            }
            
        }
    }

    public static class CompareMatrices {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstMatrix[][] = readMatrix(scanner);
            int secondMatrix[][] = readMatrix(scanner);

            boolean areEqual = compareMatrices(firstMatrix,secondMatrix);

            System.out.println(areEqual ? "equal" : "not equal");
        }

        private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
            if(firstMatrix.length != secondMatrix.length){
                return false;
            }
            for (int row = 0; row < firstMatrix.length; row++) {
                int[]firstArr = firstMatrix[row];
                int[]secondArr = secondMatrix[row];
                if(firstArr.length != secondArr.length){
                    return false;
                }
                for (int col = 0; col < firstArr.length; col++) {
                    if(firstArr[col] != secondArr[col]){
                        return false;
                    }
                }
            }
            return  true;

        }

        public static int[][] readMatrix(Scanner scanner){
            String[] tokens = scanner.nextLine().split(" ");
            int rows = Integer.parseInt(tokens[0]);
            int cols = Integer.parseInt(tokens[1]);
            int[][] matrix = new int[rows][cols];

            for (int r = 0; r < rows; r++) {
                String [] line = scanner.nextLine().split(" ");
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = Integer.parseInt(line[c]);
                }
            }
            return  matrix;
        }
    }
}
