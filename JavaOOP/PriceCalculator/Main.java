package JavaOOP.PriceCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputSeason = "Summer";

        Seasons season = Seasons.valueOf(inputSeason.toUpperCase());

        PriceCalculator priceCalculator
                = new PriceCalculator(season,Discount.VIP, 50.25,5);
    }
}
