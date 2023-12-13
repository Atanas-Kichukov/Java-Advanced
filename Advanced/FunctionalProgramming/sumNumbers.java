package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], String> getCountStr = arr -> String.format("Count = %d", arr.length);
        Function<int[], String> getSum = arr -> "Sum = " + Arrays.stream(arr).sum();


        System.out.println(getCountStr.apply(nums));
        System.out.println(getSum.apply(nums));
    }
}
