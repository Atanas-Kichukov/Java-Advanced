package Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]tokens = scanner.nextLine().split("\\s+");
        int countFirstWords = Integer.parseInt(tokens[0]);
        int secondCountWords = Integer.parseInt(tokens[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < countFirstWords; i++) {
            int firstNumbers = Integer.parseInt(scanner.nextLine());
            firstSet.add(firstNumbers);
        }
        for (int i = 0; i < secondCountWords; i++) {
            int secondNumbers = Integer.parseInt(scanner.nextLine());
            secondSet.add(secondNumbers);
        }
        firstSet.retainAll(secondSet);// проверява еднаквите елементи и сотава само тях
        firstSet.forEach(e -> System.out.print(e + " "));
    }
}
