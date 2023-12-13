package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findIndexOfMinElement = list -> {
            int min = Collections.min(list);
            return list.lastIndexOf(min);
        };


       // Consumer<List<Integer>> printer =
        // list -> System.out.println(list.lastIndexOf(Collections.min(list))); решение с consumer


        System.out.println(findIndexOfMinElement.apply(numbers));// решенеи с function
    }
}
