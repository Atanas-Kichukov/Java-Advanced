package Advanced.DefiningClasses.Google;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            Person person;
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String option = tokens[1];
            switch (option) {
                case "company":
                    String companyName = tokens[2];
                    String departments = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName,departments,salary);
                    person = new Person(name,company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    person = new Person(name,pokemon);

                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parents parents = new Parents(parentName,parentBirthday);
                    person = new Person(name,parents);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Children children = new Children(childName,childBirthday);
                    person = new Person(name, children);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Car car = new Car(carModel,carSpeed);
                    person = new Person(name,car);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
