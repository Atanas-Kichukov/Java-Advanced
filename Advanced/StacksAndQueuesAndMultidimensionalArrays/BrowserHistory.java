package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        String current = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!stack.isEmpty()) {
                    current = stack.pop();
                }
                else{
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
               if(!current.equals("")){
                   stack.push(current);
               }
               current = input;
            }
            System.out.println(current);
            input = scanner.nextLine();
        }
    }
}
