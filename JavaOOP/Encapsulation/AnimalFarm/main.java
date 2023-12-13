package JavaOOP.Encapsulation.AnimalFarm;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        try{
            Chicken chicken = new Chicken(name,age);
            System.out.println(chicken.toString());
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }



    }
}
