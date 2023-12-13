package Advanced.SetsAndMaps;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> finalScores = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            finalScores.putIfAbsent(name, new ArrayList<>());
            String[] grades = scanner.nextLine().split("\\s+");
            for (int j = 0; j < grades.length; j++) {
                double grade = Double.parseDouble(grades[j]);
                finalScores.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : finalScores.entrySet()) {
            List<Double> currentGrades = entry.getValue();
            double average = 0.0;
            for (int i = 0; i < currentGrades.size(); i++) {
                average += currentGrades.get(i);
            }
            average /= currentGrades.size();
            System.out.printf("%s is graduated with " + average ,entry.getKey());
            System.out.println();
        }

    }
}
