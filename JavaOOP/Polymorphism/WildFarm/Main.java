package JavaOOP.Polymorphism.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String evenLine = scanner.nextLine();

        List<Animal> animalList = new ArrayList<>();


        while(!evenLine.equals("End")){
            String oddLine = scanner.nextLine();

            Animal animal = createAnimal(evenLine.split("\\s+"));

            Food food = createFood(oddLine.split("\\s+"));
            animal.makeSound();
            try
            {
                animal.eatFood(food);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            animalList.add(animal);
            evenLine = scanner.nextLine();
        }
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }

    private static Food createFood(String [] tokens) {
        int quantity = Integer.parseInt(tokens[1]);
        return tokens.equals("Meat") ? new Meat(quantity) : new Vegetable(quantity);
    }

    private static Animal createAnimal(String [] tokens) {
        switch (tokens[0]){
            case"Mouse":
                return new Mouse(tokens[1],"Mouse",Double.parseDouble(tokens[2]),tokens[3]);
            case"Tiger":
                return new Tiger(tokens[1],"Tiger",Double.parseDouble(tokens[2]),tokens[3]);
            case"Zebra":
                return new Zebra(tokens[1],"Zebra",Double.parseDouble(tokens[2]),tokens[3]);
            case"Cat":
                return new Cat(tokens[1],"Cat",Double.parseDouble(tokens[2]),tokens[3],tokens[4]);
            default:
                throw new IllegalArgumentException("Unknown animal type" + tokens[0]);
        }
    }
}
