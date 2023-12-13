package Advanced.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filterByAge{
    public class Person{
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while(n-- > 0){
            String[]token = scanner.nextLine().split("\\s+");
            String name = token[0];
            int age = Integer.parseInt(token[1]);
            Person person = new Person(name,age);
            people.add(person);
        }
        String criteria = scanner.nextLine();
        int ageCriteria =Integer.parseInt(scanner.nextLine());
        Predicate<Person> ageFilter = createAgeFilter(criteria,ageCriteria );

        String formatOption = scanner.nextLine();

        Function<Person,String> formater = createFormater(formatOption);

        System.out.println(people.stream()
                .filter(ageFilter)
                .map(formater)
                .collect(Collectors.joining(System.lineSeparator())));

    }

    private Function<Person, String> createFormater(String formatOption) {
        if(formatOption.equals("name")){
            return p -> p.name;
        } else if (formatOption.equals("age")) {
            return p -> String.valueOf(p.age);
        }else{
            return p -> p.name + " - " + p.age;
        }
    }

    private Predicate<Person> createAgeFilter(String criteria, int ageCriteria) {
        if (criteria.equals("older")){
            return p-> p.age >= ageCriteria;
        }
        else{
            return p -> p.age  <= ageCriteria;
        }
    }
}
