package JavaOOP.Encapsulation.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppingsCount(numberOfToppings);
    }


    private void setName(String name) {
        if (name == null || name.length() > 15 || name.trim().isEmpty()) {
            throw new IllegalArgumentException(" Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppingsCount(int toppingsCount){
        if(toppingsCount<0 ||toppingsCount>10){
            throw new IllegalArgumentException("Number of toppings should be in range[0..10].");
        }
        this.toppings = new ArrayList<>(toppingsCount);
    }
    public void setDough(Dough dough){
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories(){
        return this.dough.calculateCalories() +
                this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }


    @Override
    public String toString(){
        return this.name + " - " + getOverallCalories();
    }
}
