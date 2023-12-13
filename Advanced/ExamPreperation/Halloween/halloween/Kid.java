package Advanced.ExamPreperation.Halloween.halloween;

public class Kid {
    private String name;
    private int age;
    private String street;

    public Kid(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }

    public int getAge() {
        return this.age;
    }


    public String getName() {
        return this.name;
    }

    public String getStreet() {
        return this.street;
    }
    @Override
    public String toString(){
        return String.format("%s, %d years old, from %s",this.name,this.age,this.street);
    }
}
