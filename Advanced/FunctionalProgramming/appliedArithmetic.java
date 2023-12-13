package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class appliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<int[], int[]> increment = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(e -> e -= 1).toArray();
        Consumer<int[]> printer = arr -> Arrays.stream(arr).forEach(e -> System.out.println(e + " "));


        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = increment.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "print":
                    printer.accept(numbers);
                    break;
            }
            command = scanner.nextLine();
        }

    }
}
