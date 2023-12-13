package Advanced.SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameAndPhone = scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>();

        while (!nameAndPhone.equals("search")) {
            String[] tokens = nameAndPhone.split("-");
            String name = tokens[0];
            String telephoneNumber = tokens[1];
            phoneBook.put(name, telephoneNumber);
            phoneBook.putIfAbsent(name, telephoneNumber);

            nameAndPhone = scanner.nextLine();
        }
        String nameToSearch = scanner.nextLine();
        while (!nameToSearch.equals("stop")) {
            if (phoneBook.containsKey(nameToSearch)) {
                System.out.printf("%s -> %s%n", nameToSearch, phoneBook.get(nameToSearch));
            } else {
                System.out.printf("Contact %s does not exist.%n", nameToSearch);
            }
            nameToSearch = scanner.nextLine();
        }
    }

}
