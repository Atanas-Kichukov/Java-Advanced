package Advanced.DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Engine engine;
            String [] input = scanner.nextLine().split("\\s+");
            String model =input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length == 2) {
                engine = new Engine(model, power);
            } else if (input.length == 3) {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            } else {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            }
            engines.add(engine);
        }
        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Car car;
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            String engine = carInfo[1];
            if (carInfo.length == 2) {
                car = new Car(model, engine);
            } else if (carInfo.length == 3) {
                try {
                    int weight = Integer.parseInt(carInfo[2]);
                    car = new Car(model, engine, weight);
                } catch (NumberFormatException e) {
                    String color = carInfo[2];
                    car = new Car(model, engine, color);
                }
            } else {
                int weight = Integer.parseInt(carInfo[2]);
                String color = carInfo[3];
                car = new Car(model, engine, weight, color);
            }
            cars.add(car);
        }


        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngine() + ":");
            engines.forEach(engine -> {
                if (engine.getModel().equals(car.getEngine())) {
                    System.out.println(engine.toString());
                }
            });
            if(car.getWeight()==0){
                System.out.println("Weight: n/a");
            }
            else {
                System.out.println("Weight: " + car.getWeight());
            }
            System.out.println("Color: " + car.getColor());
        }
    }
}
