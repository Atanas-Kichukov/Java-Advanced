package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        ArrayDeque<String> reversedNumbers = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            String symbol = numbers[i];
            reversedNumbers.push(symbol);
        }
        for (String reversedNumber : reversedNumbers) {
            System.out.print(reversedNumber + " ");
        }
    }
}
