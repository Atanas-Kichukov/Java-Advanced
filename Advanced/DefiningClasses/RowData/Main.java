package Advanced.DefiningClasses.RowData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            Car car;
            String model = input[0];
            int engineSpeed =Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tier1Pressure = Double.parseDouble(input[5]);
            int tier1Age = Integer.parseInt(input[6]);
            double tier2Pressure = Double.parseDouble(input[7]);
            int tier2Age = Integer.parseInt(input[8]);
            double tier3Pressure = Double.parseDouble(input[9]);
            int tier3Age = Integer.parseInt(input[10]);
            double tier4Pressure = Double.parseDouble(input[11]);
            int tier4Age = Integer.parseInt(input[12]);
            Engine engine = new Engine(engineSpeed,enginePower);
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            Tire tire1 = new Tire(tier1Pressure,tier1Age);
            Tire tire2 = new Tire(tier2Pressure,tier2Age);
            Tire tire3 = new Tire(tier3Pressure,tier3Age);
            Tire tire4 = new Tire(tier4Pressure,tier4Age);
            car = new Car(model,engine,cargo,new ArrayList<>());
            car.getTires().add(tire1);
            car.getTires().add(tire2);
            car.getTires().add(tire3);
            car.getTires().add(tire4);
            cars.put(model,car);
        }
        String command = scanner.nextLine();
        if(command.equals("fragile")){
            for (Map.Entry<String, Car> entry : cars.entrySet()){
                if(entry.getValue().getCargo().getCargoType().equals("fragile")){
                    List<Tire> tires = entry.getValue().getTires();
                    for(Tire tire : tires){
                        if(tire.getTirePressure()<1){
                            System.out.println(entry.getKey());
                            break;
                        }
                    }
                }
            }
        }
        else if (command.equals("flamable")){
            for(Map.Entry<String, Car> entry : cars.entrySet()){
                if(entry.getValue().getEngine().getEnginePower()>250){
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
