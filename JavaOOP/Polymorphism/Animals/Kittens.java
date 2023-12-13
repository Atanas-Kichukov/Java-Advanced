package JavaOOP.Polymorphism.Animals;

public class Kittens extends Cat{
    public Kittens(String name,int age){
        super(name,age,Gender.FEMALE);
    }
    @Override
    public String produceSound(){
        return "Meow";
    }
}
