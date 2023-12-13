package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            stack.push(tokens[i]);
        }
        while (stack.size() > 1) {
            int number = Integer.valueOf(stack.pop());
            String operation = stack.pop();
            int secondNumber = Integer.valueOf(stack.pop());

            switch (operation) {
                case "+":
                    stack.push(String.valueOf(number + secondNumber));
                    break;
                case "-":
                    stack.push(String.valueOf(number - secondNumber));
                    break;
            }

        }
        System.out.println(stack.pop());
    }
}
