package JavaOOP.Working_With_Abstraction.Person;

public class Person {
    private String name;

    public int getAge() {
        return this.age;
    }

    private int age;

    public String getName() {
        return this.name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
