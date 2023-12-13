package JavaOOP.Polymorphism.Animals;

public class Animal {
    private String name;
    private int age;
    Gender gender;
    public Animal(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }
    protected String produceSound(){
        return"";
    }
}
