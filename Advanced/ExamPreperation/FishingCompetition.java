package Advanced.ExamPreperation;

import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] sea = new char[size][size];
        int playerRow = 0;
        int playerCol = 0;
        int quota = 0;
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            if (line.contains("S")) {
                playerRow = i;
                playerCol = line.indexOf("S");
            }
            sea[i] = line.toCharArray();

        }
        String command = scanner.nextLine();
        while (!command.equals("collect the nets")) {
            char element = ' ';
            switch (command) {
                case "up":
                    sea[playerRow][playerCol] = '-';
                    if (isOutOfBounds(playerRow - 1, playerCol, sea)) {
                        playerRow = size - 1;
                         element = sea[playerRow][playerCol];
                    }else {
                         element = sea[playerRow - 1][playerCol];
                         playerRow -=1;
                    }
                    if (Character.isDigit(element)) {
                        quota +=Integer.parseInt(String.valueOf(element));
                    } else if (Character.isLetter(element)) {
                        System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                " Last coordinates of the ship: [%d,%d]", playerRow, playerCol);
                        return;
                    }
                    sea[playerRow][playerCol] = 'S';
                    printMatrix(sea);
                    break;
                case "down":
                    sea[playerRow][playerCol] = '-';
                    element =' ';
                    if (isOutOfBounds(playerRow + 1, playerCol, sea)) {
                        playerRow = 0;
                        element = sea[playerRow][playerCol];
                    }else {
                        element = sea[playerRow + 1][playerCol];
                        playerRow += 1;
                    }
                    if (Character.isDigit(element)) {
                        quota +=Integer.parseInt(String.valueOf(element));
                    } else if (Character.isLetter(element)) {
                        System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                " Last coordinates of the ship: [%d,%d]", playerRow, playerCol);
                        return;
                    }
                    sea[playerRow][playerCol] = 'S';
                    printMatrix(sea);
                    break;
                case "left":
                    sea[playerRow][playerCol] = '-';
                    element =' ';
                    if (isOutOfBounds(playerRow, playerCol - 1, sea)) {
                        playerCol = size - 1;
                        element = sea[playerRow][playerCol];
                    }else {
                        element = sea[playerRow][playerCol - 1];
                        playerCol -=1;
                    }
                    if (Character.isDigit(element)) {
                        quota +=Integer.parseInt(String.valueOf(element));
                    } else if (Character.isLetter(element)) {
                        System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. " +
                                "Last coordinates of the ship: [%d,%d]", playerRow, playerCol);
                        return;
                    }
                    sea[playerRow][playerCol] = 'S';
                    printMatrix(sea);
                    break;
                case "right":
                    sea[playerRow][playerCol] = '-';
                    element =' ';
                    if (isOutOfBounds(playerRow, playerCol + 1, sea)) {
                        playerCol = 0;
                        element = sea[playerRow][playerCol];
                    }else {
                        element = sea[playerRow][playerCol + 1];
                        playerCol +=1;
                    }
                    if (Character.isDigit(element)) {
                        quota +=Integer.parseInt(String.valueOf(element));
                    } else if (Character.isLetter(element)) {
                        System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. " +
                                "Last coordinates of the ship: [%d,%d]", playerRow, playerCol);
                        return;
                    }
                    sea[playerRow][playerCol] = 'S';
                    printMatrix(sea);
                    break;
            }
            command = scanner.nextLine();
        }
        if(quota<20){
            System.out.printf("You didn't catch enough fish and didn't reach the quota! " +
                    "You need %d tons of fish more.%n",20 - quota);
        }else {
            System.out.println("Success! You managed to reach the quota!");
        }
        if(quota>0){
            System.out.printf("Amount of fish caught: %d tons.",quota);
        }
        System.out.println();
        printMatrix(sea);
    }

    public static boolean isOutOfBounds(int row, int col, char[][] sea) {
        return row < 0 || row >= sea.length || col < 0 || col >= sea[row].length;
    }

    public static void printMatrix(char[][] sea) {
        for (int row = 0; row < sea.length; row++) {
            for (int col = 0; col < sea[row].length; col++) {
                System.out.print(sea[row][col]);
            }
            System.out.println();
        }
    }
}
