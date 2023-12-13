package Advanced.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Set<Integer>firstHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int firstCard = firstHand.iterator().next();
        firstHand.remove(firstCard);
        int secondCard = secondHand.iterator().next();
        secondHand.remove(secondCard);
        int round = 50;
        while (round-- > 0 && !firstHand.isEmpty() && !secondHand.isEmpty()) {
            if(firstCard>secondCard){
                firstHand.add(firstCard);
                firstHand.add(secondCard);
            }
            else{
                secondHand.add(secondCard);
                secondHand.add(firstCard);
            }
        }
        if(firstHand.size()>secondHand.size()){
            System.out.println("First player win!");
        }
        else if(firstHand.size()<secondHand.size()){
            System.out.println("Second player win!");
        }
        else{
            System.out.println("Draw!");
        }
    }
}
