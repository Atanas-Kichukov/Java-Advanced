package Advanced.IteratorsAndComparators.StategyPattern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<Person> comparedByName = new TreeSet<>(new PersonNameComparator());
        TreeSet<Person> comparedByAge = new TreeSet<>(new PersonAgeComperator());
        HashSet<Person> adb = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);

            Person person = new Person(name, age);
            comparedByName.add(person);
            comparedByAge.add(person);
        }

        comparedByName.forEach(p -> System.out.println(p));
        comparedByAge.forEach(p -> System.out.println(p));
    }

}
