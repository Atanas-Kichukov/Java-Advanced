package Advanced.SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToInput = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continentCountryCity  = new LinkedHashMap<>();
        for (int i = 0; i < numberToInput; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            continentCountryCity.putIfAbsent(continent, new LinkedHashMap<>());
            continentCountryCity.get(continent).putIfAbsent(country,new ArrayList<>());
            continentCountryCity.get(continent).get(country).add(city);
        }
        continentCountryCity.forEach((key, value) ->{
            System.out.printf("%s:%n", key);
            value.forEach((innerKey, innerValue) -> {
                System.out.printf("  %s -> ",innerKey);
                    System.out.println(String.join(", ",innerValue));


            });
        });
    }
}
