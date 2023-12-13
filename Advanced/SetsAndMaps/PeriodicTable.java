package Advanced.SetsAndMaps;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Set<String> usedElements = new TreeSet<>();
        for (int i = 0; i < count; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            usedElements.addAll(Arrays.asList(elements));
        }
        System.out.println(String.join(" ",usedElements));
    }
}
