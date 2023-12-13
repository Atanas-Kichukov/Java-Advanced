package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> backHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (backHistory.size() > 1) {
                    forwardHistory.push(backHistory.pop());
                    System.out.println(backHistory.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (command.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    backHistory.push(forwardHistory.peek());
                    System.out.println(forwardHistory.pop());
                }
            } else {
                backHistory.push(command);
                System.out.println(command);
                forwardHistory.clear();
            }
            command = scanner.nextLine();
        }

    }

    public static class balancedParentheses {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayDeque<Character> brackets = new ArrayDeque<>();
            String input = scanner.nextLine();
            boolean matched = true;
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    brackets.push(current);
                } else if (current == ')' || current == ']' || current == '}') {
                    if (brackets.isEmpty()) {
                        matched = false;
                    } else {
                        char closingBracket =  brackets.pop();
                        if(current == ')' && closingBracket !='('){
                            matched = false;
                        }
                        else if(current ==']' && closingBracket !='['){
                            matched = false;
                        } else if (current =='}' && closingBracket!='{') {
                            matched = false;
                        }
                    }
                }
            }

            if (matched) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
