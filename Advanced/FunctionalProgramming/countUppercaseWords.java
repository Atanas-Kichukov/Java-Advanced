package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class countUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        Predicate<String> isUppercase = w -> Character.isUpperCase(w.charAt(0));

        List<String> words = Arrays.stream(text).filter(isUppercase).collect(Collectors.toList());
        System.out.println(words.size());

        System.out.println(words.stream()
                .collect(Collectors.joining(System.lineSeparator())));


    }
}
