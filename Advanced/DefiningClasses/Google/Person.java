package Advanced.DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;

    public Person(String name,Company company){
        this.name = name;
        this.company = company;
    }
    public Person(String name,Pokemon pokemon){
        this.name = name;
        this.pokemon = new ArrayList<>();
    }
    public Person(String name, Parents parents){
        this.name = name;
        this.parents = new ArrayList<>();
    }
    public Person (String name, Children children){
        this.name = name;
        this.children = new ArrayList<>();
    }
    public Person (String name,Car car){
        this.name = name;
        this.car = car;
    }

}
