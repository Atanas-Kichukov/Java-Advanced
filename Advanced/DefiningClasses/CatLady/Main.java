package Advanced.DefiningClasses.CatLady;

import Advanced.DefiningClasses.CatLady.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        List<Cat> cats = new ArrayList<>();
        while(!input.equals("End")){
            String[]tokens = input.split("\\s+");
            String breed = tokens[0];
            String name = tokens[1];
            double earFurOrDecibels = Double.parseDouble(tokens[2]);
            Cat cat = new Cat(breed,name,earFurOrDecibels);
            cats.add(cat);
            input = scanner.nextLine();
        }
        String catName = scanner.nextLine();
        for(Cat cat : cats){
            if(catName.equals(cat.getName())){
                System.out.println(cat.toString());
            }
        }
    }
}
