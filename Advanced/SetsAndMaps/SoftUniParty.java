package Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vips = new LinkedHashSet<>();
        Set<String> commons = new LinkedHashSet<>();


        String guest = scanner.nextLine();
        while (!guest.equals("PARTY")) {
            if (Character.isDigit(guest.charAt(0))) {
                vips.add(guest);
            } else {
                commons.add(guest);
            }
            guest = scanner.nextLine();
        }
        String arrivedGuest = scanner.nextLine();
        Set<String>allGuest = new TreeSet<>(vips);
        allGuest.addAll(commons);
        while(!arrivedGuest.equals("END")){
            allGuest.remove(arrivedGuest);
            arrivedGuest = scanner.nextLine();
        }
        System.out.println(allGuest.size());
        for (String notArrived : allGuest) {
            System.out.println(notArrived);
        }
    }
}
