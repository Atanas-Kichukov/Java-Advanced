package JavaOOP.Working_With_Abstraction.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] startLight = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for(String color: startLight){
            TrafficLight trafficLight = new TrafficLight(Colors.valueOf(color));
            trafficLights.add(trafficLight);
        }
        for (int i = 0; i < count; i++) {
            for(TrafficLight light: trafficLights){
                light.update();
                System.out.print(light.getColors() + " ");
            }
            System.out.println();

        }
    }
}
