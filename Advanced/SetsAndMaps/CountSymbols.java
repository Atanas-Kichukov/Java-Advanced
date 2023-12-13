package Advanced.SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> symbolCount = new TreeMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            symbolCount.putIfAbsent(letter,0);
            symbolCount.put(letter,symbolCount.get(letter) + 1);
        }

        symbolCount.forEach((k,v) -> {
            System.out.printf("%c: %d time/s%n",k,v);
        });




    }

}
