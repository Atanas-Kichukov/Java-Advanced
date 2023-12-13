package JavaOOP.InterfacesAndAbstraction.MultipleImplementation;

public class Pet implements Creature, Birthable {
    private String name;
    private String birthDate;


    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDay() {
        return this.birthDate;
    }

}
