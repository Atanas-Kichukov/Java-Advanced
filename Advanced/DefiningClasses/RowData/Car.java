package Advanced.DefiningClasses.RowData;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car (String model, Engine engine, Cargo cargo, List<Tire> tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
    public List<Tire> getTires(){
        return this.tires;
    }
    public Cargo getCargo(){
        return this.cargo;
    }
    public Engine getEngine(){
        return this.engine;
    }
}
