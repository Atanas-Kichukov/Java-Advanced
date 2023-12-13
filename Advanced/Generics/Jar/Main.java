package Advanced.Generics.Jar;

import Advanced.Generics.Scale.Person;
import Advanced.Generics.Scale.Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Person> scale = new Scale<>(new Person(90), new Person(32));
        System.out.println(scale.getHeavier());


    }
}
