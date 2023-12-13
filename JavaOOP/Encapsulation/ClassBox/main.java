package JavaOOP.Encapsulation.ClassBox;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());


        try {
            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f%n" +
                    "Lateral Surface Area - %.2f%n" +
                    "Volume – %.2f%n", box.calculateSurfaceArea(),
                    box.calculateLateralSurfaceArea(),
                    box.calculateVolume());
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
