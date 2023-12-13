package Advanced.StacksAndQueuesAndMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while(!file.equals("print")){
            if(file.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                else {
                    String fileToRemove = queue.poll();
                    System.out.println("Canceled " + fileToRemove);
                }
            }
            else{
                queue.offer(file);
            }
            file = scanner.nextLine();
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
