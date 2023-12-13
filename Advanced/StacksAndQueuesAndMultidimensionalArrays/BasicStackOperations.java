package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);//колко да пушна
        int s = Integer.parseInt(input[1]);//колко да попна
        int x = Integer.parseInt(input[2]);//числото което трябва да проверя дали го има
        int smallestNum = Integer.MAX_VALUE;
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        } else {
            for (int i = 0; i < s; i++) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        } else {
            for (int i = 0; i < stack.size(); i++) {
                int current = stack.pop();
                if (current == x) {
                    System.out.println("true");
                    return;
                }
                if (current < smallestNum) {
                    smallestNum = current;
                }
            }
        }
        System.out.println(smallestNum);
    }
}
