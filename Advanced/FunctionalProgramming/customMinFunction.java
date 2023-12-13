package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class customMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[],Integer> smallestNum = number ->Arrays.stream(numbers).min().orElse(0);


        System.out.println(smallestNum.apply(numbers));
    }
}
