package Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String information = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();
        while (!information.equals("END")) {
            String[] tokens = information.split(", ");
            String inOrOut = tokens[0];
            String carPlate = tokens[1];
            if (inOrOut.equals("IN")) {
                parkingLot.add(carPlate);
            } else {
                parkingLot.remove(carPlate);
            }

            information = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String cars : parkingLot) {
                System.out.println(cars);
            }
        }
    }
}
