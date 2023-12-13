package Advanced.IteratorsAndComparators.Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stonesNumber = Arrays.stream(scanner.nextLine().split(", +"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Lake lake = new Lake(stonesNumber);
        Iterator it = lake.iterator();

        StringBuilder sb = new StringBuilder();
       for(Integer integer:lake){
           sb.append(integer).append(", ");

       }
        System.out.println(sb.toString().substring(0,sb.toString().lastIndexOf(", ")));
    }
}
