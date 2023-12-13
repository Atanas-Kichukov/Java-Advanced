package Advanced.IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());
        Person personForCompare = people.get(n - 1);
        people.remove(n - 1);
        int countEqual = 0;
        for (Person person : people) {
            if (personForCompare.compareTo(person) == 0) {
                countEqual++;
            }
            else{

            }
        }
        if(countEqual ==0){
            System.out.println("No matches");
        }
        else{
            System.out.println(countEqual + " " + (people.size()
                    - countEqual) + " " + (people.size() + 1));

        }
    }
}
