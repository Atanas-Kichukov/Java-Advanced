package JavaOOP.Polymorphism.VehiclesExtended;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        String[] carTokens = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2])
                , Double.parseDouble(carTokens[3]));

        String[] truckTokens = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2])
                , Double.parseDouble(truckTokens[3]));

        String[] busTokens = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2])
                , Double.parseDouble(busTokens[3]));


        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);

        int commandCount = Integer.parseInt(scanner.nextLine());
        while (commandCount-- > 0) {
            try {
                String[] input = scanner.nextLine().split("\\s+");
                String command = input[0];
                String vehicle = input[1];
                double value = Double.parseDouble(input[2]);
                if (command.equals("Drive") && vehicle.equals("Bus")) {
                    System.out.println(bus.driveBus(value));
                } else if (command.equals("Refuel")) {
                    vehicleMap.get(vehicle).refuel(value);
                } else {
                    System.out.println(vehicleMap.get(vehicle).drive(value));
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }


        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
