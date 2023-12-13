package JavaOOP.Encapsulation.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String[] pizzaInfo = scanner.nextLine().split("\\s+");
            String pizzaName = pizzaInfo[1];
            int toppingsCount = Integer.parseInt(pizzaInfo[2]);
        try {
            Pizza pizza = new Pizza(pizzaName, toppingsCount);

            String[] doughInfo = scanner.nextLine().split("\\s+");
            String flourType = doughInfo[1];
            String bakingTechnique = doughInfo[2];
            double weight = Double.parseDouble(doughInfo[3]);
            Dough dough = new Dough(flourType, bakingTechnique, weight);
            pizza.setDough(dough);


            String toppings = scanner.nextLine();
            while (!toppings.equals("END")) {
                String[] tokens = toppings.split("\\s+");
                String type = tokens[1];
                double toppingWeight = Double.parseDouble(tokens[2]);
                Topping topping = new Topping(type, toppingWeight);
                pizza.addTopping(topping);
                toppings = scanner.nextLine();
            }
            System.out.println(pizza.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
