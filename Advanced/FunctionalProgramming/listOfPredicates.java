package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class listOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());


        BiFunction<List<Integer>, Integer, Boolean> predicate = ((list, number) -> {

            for (Integer numInList : list) {
                if (n % numInList != 0) {
                    return false;
                }
            }
            return true;
        });

        for (int i = 1; i <= n; i++) {
            if (predicate.apply(numbers, n)) {
                System.out.println(n + " ");
            }
        }


    }
}
