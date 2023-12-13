package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class predicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        Predicate<String> lengthCheck = name -> name.length() <= maxLength;
        Arrays.stream(names).filter(lengthCheck).forEach(System.out::println);
    }
}
