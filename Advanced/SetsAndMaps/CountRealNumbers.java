package Advanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Map<Double, Integer> numbers = new LinkedHashMap<>();

        for (String s : input) {
            double numToAdd = Double.parseDouble(s);
            if (numbers.containsKey(numToAdd)) {
                numbers.put(numToAdd, numbers.get(numToAdd) + 1);
            }
            numbers.putIfAbsent(numToAdd, 1);

        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.println(String.format("%.1f -> %d",entry.getKey(),entry.getValue()));
        }


    }
}
