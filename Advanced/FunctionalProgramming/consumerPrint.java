package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class consumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        Consumer<String> printer = name -> System.out.println("Sir " + name);

        for(String name : names){
            printer.accept(name);
        }
    }
}
