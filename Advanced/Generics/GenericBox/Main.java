package Advanced.Generics.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }
        System.out.println(box.toString());
    }
}
