package Advanced.ExamPreperation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChocoTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milkChocolate = 0;
        int darkChocolate = 0;
        int bakingChocolate = 0;


        ArrayDeque<Double> milk = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> cocoa = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new))
                .forEach(cocoa::push);


        while (!milk.isEmpty() && !cocoa.isEmpty()) {
            double usedMilk = milk.poll();
            double usedCocoa = cocoa.pop();
            double neededIngredients = Math.round((usedCocoa / (usedCocoa + usedMilk)) * 100);
            if (neededIngredients == 30) {
                milkChocolate++;
            } else if (neededIngredients == 50) {
                darkChocolate++;
            } else if (neededIngredients == 100) {
                bakingChocolate++;
            } else {
                usedMilk += 10;
                milk.offer(usedMilk);
            }
        }
        if (milkChocolate > 0 && darkChocolate > 0 && bakingChocolate > 0) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            System.out.printf("# Baking Chocolate --> %d%n",bakingChocolate);
            System.out.printf("# Dark Chocolate --> %d%n",darkChocolate);
            System.out.printf("# Milk Chocolate --> %d",milkChocolate);


        }
        else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            if(bakingChocolate>0){
                System.out.printf("# Baking Chocolate --> %d%n",bakingChocolate);
            }
            if(darkChocolate>0){
                System.out.printf("# Dark Chocolate --> %d%n",darkChocolate);
            }
            if (milkChocolate>0){
                System.out.printf("# Milk Chocolate --> %d",milkChocolate);
            }
        }
    }

}
