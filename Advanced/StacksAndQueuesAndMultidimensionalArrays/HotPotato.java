package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidNames = scanner.nextLine().split(" ");
        int burnedKid = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> kidsPlaying = new ArrayDeque<>();

        for (int i = 0; i < kidNames.length; i++) {
            String kidToAdd = kidNames[i];
            kidsPlaying.offer(kidToAdd);
        }

        while(kidsPlaying.size()>1) {
            for (int i = 0; i < burnedKid - 1; i++) {
                String addToEnd = kidsPlaying.pop();
                kidsPlaying.offer(addToEnd);
            }
            System.out.println("Removed " + kidsPlaying.poll());
        }
        System.out.println("Last is " + kidsPlaying.poll());
    }
}
