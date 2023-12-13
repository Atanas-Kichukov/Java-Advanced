package Advanced.AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("end")){
            String [] tokens = input.split(" : " );
            String courseName = tokens[0];
            String studentName = tokens[1];



            courses.putIfAbsent(courseName, new ArrayList<>());
            List<String>students = courses.get(courseName);
            students.add(studentName);
           // courses.get(courseName).add(studentName);








            input = scanner.nextLine();
        }





    }
}
