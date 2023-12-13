package JavaOOP.Polymorphism.Animals;

public class TomCats extends Cat{
    public TomCats(String name, int age){
        super(name,age,Gender.MALE);
    }
    @Override
    public String produceSound(){
        return "MEOW";
    }
}
