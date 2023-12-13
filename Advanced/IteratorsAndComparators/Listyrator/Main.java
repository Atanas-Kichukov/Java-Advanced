package Advanced.IteratorsAndComparators.Listyrator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<String> data = Arrays.stream(command.split("\\s+")).skip(1)
                .collect(Collectors.toCollection(ArrayList::new));
        ListyIrator listyIrator = new ListyIrator(data);
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(listyIrator.move());
                    break;
                case "Print":
                    System.out.println(listyIrator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIrator.iterator().hasNext());
                    break;
                case "PrintAll":
                    listyIrator.forEach(s -> System.out.print(s + " "));
//                    for(String s : listyIrator){
//                        System.out.println(s + " ");
//                    }
                        System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
