package Advanced.ExamPreperation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> male = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new))
                .forEach(male::push);

        ArrayDeque<Integer> female = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        int count = 0;
        while (!female.isEmpty() && !male.isEmpty()) {
            int femaleNumber = female.poll();
            if (femaleNumber == 0 && !female.isEmpty()) {
                femaleNumber = female.poll();

            }
            if (femaleNumber % 25 == 0 && !female.isEmpty()) {
                female.poll();
                if (female.isEmpty()) {
                    break;
                }
                femaleNumber = female.poll();

            }
            int maleNumber = male.pop();
            if (maleNumber == 0) {
                if (male.isEmpty()) {
                    break;
                }
                maleNumber = male.pop();
            }
            if (maleNumber % 25 == 0 && !male.isEmpty()) {
                male.pop();
                if(!male.isEmpty()) {
                    maleNumber = male.pop();
                }
            }
            if (femaleNumber != maleNumber) {
                maleNumber -= 2;
                if (maleNumber > 0) {
                    male.push(maleNumber);
                }
            } else {
                count++;
            }
        }
        System.out.println("Matches: " + count);
        String maleOutput = "Males left: " + (male.isEmpty() ? "none" : male
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println(maleOutput);

        String femaleOutput = "Females left: " + (female.isEmpty() ? "none" : female
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println(femaleOutput);
    }
}
