package Advanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> resources = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while(!resource.equals("stop")){


            int quantity = Integer.parseInt(scanner.nextLine());
            resources.put(resource,quantity);
            resource = scanner.nextLine();
        }
       resources.forEach((k,v)->{
           System.out.printf("%s -> %d%n",k,v);
       });
    }
}
