package JavaOOP.Working_With_Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        int cardPower = Cards.valueOf(rank).getPower() + CardSuits.valueOf(suit).getPower();

        System.out.printf("Card name: %s of %s; Card power: %d"
                ,Cards.valueOf(rank),CardSuits.valueOf(suit),cardPower);
    }
}
