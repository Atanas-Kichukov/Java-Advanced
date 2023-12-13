package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < commandCount; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            int maxNum = Integer.MIN_VALUE;
            switch (command) {
                case "1":
                int numberToPush = Integer.parseInt(tokens[1]);
                stack.push(numberToPush);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    for (Integer integer : stack) {
                        if (integer > maxNum) {
                            maxNum = integer;
                        }
                    }
                    System.out.println(maxNum);
                    break;
            }
        }


    }
}
