package Advanced.ExamPreperation;

import java.util.Scanner;

public class Snake {
    public static int food = 0;
    public static int rowSnake = 0, colSnake = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[size][size];

        int[] firstBurrowIndexes = {-1, -1};
        int[] secondBurrowIndexes = {-1, -1};

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            if (line.contains("S")) {
                rowSnake = i;
                colSnake = line.indexOf("S");
            }
            fillBurrowIndexes(firstBurrowIndexes, secondBurrowIndexes, i, line);

            field[i] = line.toCharArray();
        }
        while (food < 10) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                if (isOutOfBounds(rowSnake - 1, colSnake, field)) {
                    break;
                } else {
                    if (!moveSnake(rowSnake, colSnake, rowSnake - 1, colSnake, field)) {
                        rowSnake--;
                    }
                }
            } else if (command.equals("down")) {
                if (isOutOfBounds(rowSnake + 1, colSnake, field)) {
                    break;
                } else {
                    if (!moveSnake(rowSnake, colSnake, rowSnake + 1, colSnake, field)) {
                        rowSnake++;
                    }
                }

            } else if (command.equals("left")) {
                if (isOutOfBounds(rowSnake, colSnake - 1, field)) {
                    break;
                } else {
                    if (!moveSnake(rowSnake, colSnake, rowSnake, colSnake - 1, field)) {
                        colSnake--;
                    }
                }
            } else if (command.equals("right")) {
                if (isOutOfBounds(rowSnake, colSnake + 1, field)) {
                    break;
                } else {
                    if ((!moveSnake(rowSnake, colSnake, rowSnake, colSnake + 1, field))) {
                        colSnake++;
                    }
                }
            }
        }
        if (food >= 10) {
            System.out.println("You won! You fed the snake.");
        } else {
            field[rowSnake][colSnake] = '.';
            System.out.println("Game over!");
        }
        System.out.println("Food eaten: " + food);
        printMatrix(field);
    }

    private static boolean moveSnake(int oldRow, int oldCol, int newRow, int newCol, char[][] field) {
        if (field[newRow][newCol] == '-') {
            field[newRow][newCol] = 'S';
        } else if (field[newRow][newCol] == '*') {
            field[newRow][newCol] = 'S';
            food++;
        } else if (field[newRow][newCol] == 'B') {
            for (int row = 0; row < field.length; row++) {
                for (int col = 0; col < field[row].length; col++) {
                    if (field[row][col] == 'B' && (row != newRow || col != newCol)) {
                        field[row][col] = 'S';
                        field[newRow][newCol] = '.';
                        field[oldRow][oldCol] = '.';
                        rowSnake = row;
                        colSnake = col;
                        return true;
                    }
                }
            }
        }
        field[oldRow][oldCol] = '.';
        return false;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] field) {
        return row < 0 || row >= field.length || col < 0 || col >= field[row].length;
    }

    private static void fillBurrowIndexes(int[] firstBurrowIndexes, int[] secondBurrowIndexes, int i, String line) {
        if (line.contains("B")) {
            if (firstBurrowIndexes[0] == -1) {
                firstBurrowIndexes[0] = i;
                firstBurrowIndexes[1] = line.indexOf("B");
            } else {
                secondBurrowIndexes[0] = i;
                secondBurrowIndexes[1] = line.indexOf("B");
            }
        }
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
