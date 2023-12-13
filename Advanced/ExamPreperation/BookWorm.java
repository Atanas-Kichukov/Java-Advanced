package Advanced.ExamPreperation;

import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scanner.nextLine());

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int playerRow = 0;
        int playerCol = 0;
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("P")) {
                playerRow = i;
                playerCol = line.indexOf("P");
            }
        }
        String movement = scanner.nextLine();
        while (!movement.equals("end")) {
            switch (movement) {
                case "up":
                    if (isOutOfBounds(playerRow - 1, playerCol, matrix)) {
                        word.deleteCharAt(word.length() - 1);
                        break;
                    } else {
                        matrix[playerRow][playerCol] = '-';
                        playerRow--;
                        char positionToMove = matrix[playerRow][playerCol];
                        if (Character.isLetter(positionToMove)) {
                            word.append(positionToMove);
                        }
                        matrix[playerRow][playerCol] = 'P';
                    }
                    break;
                case "down":
                    if (isOutOfBounds(playerRow + 1, playerCol, matrix)) {
                        word.deleteCharAt(word.length() - 1);
                        break;
                    } else {
                        matrix[playerRow][playerCol] = '-';
                        playerRow++;
                        char positionToMove = matrix[playerRow][playerCol];
                        if (Character.isLetter(positionToMove)) {
                            word.append(positionToMove);
                        }
                        matrix[playerRow][playerCol] = 'P';
                    }
                    break;
                case "left":
                    if (isOutOfBounds(playerRow, playerCol - 1, matrix)) {
                        word.deleteCharAt(word.length() - 1);
                        break;
                    } else {
                        matrix[playerRow][playerCol] = '-';
                        playerCol--;
                        char positionToMove = matrix[playerRow][playerCol];
                        if (Character.isLetter(positionToMove)) {
                            word.append(positionToMove);
                        }
                        matrix[playerRow][playerCol] = 'P';
                    }

                    break;
                case "right":
                    if (isOutOfBounds(playerRow, playerCol, matrix)) {
                        word.deleteCharAt(word.length() - 1);
                        break;
                    } else {
                        matrix[playerRow][playerCol] = '-';
                        playerCol++;
                        char positionToMove = matrix[playerRow][playerCol];
                        if (Character.isLetter(positionToMove)) {
                            word.append(positionToMove);
                        }
                        matrix[playerRow][playerCol] = 'P';
                    }
                    break;
            }
            movement = scanner.nextLine();
        }
        System.out.println(word);
        printMatrix(matrix);
    }

    public static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
