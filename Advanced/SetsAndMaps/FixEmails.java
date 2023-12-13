package Advanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            int lastIndex = email.lastIndexOf('.');
            String domain = email.substring(lastIndex + 1);
            if (!domain.equals("uk") && !domain.equals("us")
                    && !domain.equals("com")) {
                emails.put(name,email);
            }
            name = scanner.nextLine();
        }

        emails.forEach((key,value) -> {
            System.out.printf("%s -> %s%n",key,value);
        });

    }


}

