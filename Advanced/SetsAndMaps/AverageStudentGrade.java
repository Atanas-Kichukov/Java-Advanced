package Advanced.SetsAndMaps;

import java.util.*;

public class AverageStudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentRecord = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String[]tokens = scanner.nextLine().split("\\s+");
            String student = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            studentRecord.putIfAbsent(student, new ArrayList<>());
            studentRecord.get(student).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : studentRecord.entrySet()) {
            List<Double> currentList = entry.getValue();
            double currentAverage = 0.0;
            for (int i = 0; i < currentList.size(); i++) {
                currentAverage += currentList.get(i);
            }
            currentAverage /=currentList.size();
            System.out.printf("%s -> ",entry.getKey());
            entry.getValue().forEach(grade -> System.out.printf("%.2f ",grade));
            System.out.printf("(avg: %.2f)%n", currentAverage);
        }


    }
}
