package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        String output = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 ==0)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);

        output = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 ==0)
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
