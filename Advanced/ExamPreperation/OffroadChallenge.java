package Advanced.ExamPreperation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> initialFuel =new ArrayDeque<>();
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new)).forEach(initialFuel::push);


        ArrayDeque<Integer> additionalConsumption=Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int firstElement = additionalConsumption.poll();
        int lastElement = initialFuel.pop();

        List<Integer> neededFuel = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            int countReachedAltitudes = 0;
            int availableFuel = lastElement - firstElement;
            while(!neededFuel.isEmpty() && availableFuel>=neededFuel.get(0)){
                int fueaaal = neededFuel.get(0);
                neededFuel.remove(0);
                countReachedAltitudes++;
                availableFuel = initialFuel.pop() - additionalConsumption.poll();
                System.out.printf("John has reached: Altitude %d%n",countReachedAltitudes);
            }
            if(!neededFuel.isEmpty()){
                System.out.printf("John did not reach: Altitude %d%n",countReachedAltitudes + 1);
            }
            if(neededFuel.isEmpty()){
                System.out.println("John has reached all the altitudes and managed to reach the top!");
            }
            else if (countReachedAltitudes==0){
                System.out.println("John failed to reach the top.");
                System.out.println("John didn't reach any altitude.");
            }
            else if(countReachedAltitudes>0){
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= countReachedAltitudes; i++) {
                    sb.append("Altitude " + i);
                    if (i != countReachedAltitudes) {
                        sb.append(", ");
                    }
                }
                System.out.printf("John failed to reach the top.%n");
                System.out.print("Reached altitudes: " + sb);


            }
    }
}
