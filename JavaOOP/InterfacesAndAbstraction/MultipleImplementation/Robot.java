package JavaOOP.InterfacesAndAbstraction.MultipleImplementation;

public class Robot implements Identifiable, Machine{
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;

    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
