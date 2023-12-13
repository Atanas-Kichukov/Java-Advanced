package Advanced.SetsAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Double>> allShops = new TreeMap<>();
        String command = scanner.nextLine();
        while(!command.equals("Revision")){
            String[]tokens = command.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            allShops.putIfAbsent(shop,new LinkedHashMap<>());
            allShops.get(shop).put(product,price);

            command = scanner.nextLine();
        }
       allShops.forEach((k,v) ->{
           System.out.println(k + "->");
           v.forEach((innerKey,innerValue) ->
                   System.out.printf("Product: %s, Price: %.1f%n",innerKey,innerValue));
        });
    }
}
