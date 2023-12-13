package JavaOOP.Polymorphism.Vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Vehicle> vehicleMap = new HashMap<>();

        String[] carTokens = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));

        String[] truckTokens = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);

        int commandCount = Integer.parseInt(scanner.nextLine());
        while(commandCount-- > 0){
            String [] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String vehicle = input[1];
            double value = Double.parseDouble(input[2]);
            if(command.equals("Drive")){
                System.out.println(vehicleMap.get(vehicle).drive(value));
            }
            else {
                vehicleMap.get(vehicle).refuel(value);
            }
        }
        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }

    }
}
