package JavaOOP.Encapsulation.Pizza;

import java.util.Map;

public class Topping {
    private String toppingType;
    private double weight;

    private static final Map<String, Double> TOPPING_TYPE_WITH_MODIFIERS
            = Map.of("Meat", 1.2,
            "Veggies", 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9);

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
//        switch (type) {
//            case "meat":
//                break;
//            case "veggies":
//                break;
//            case "cheese":
//                break;
//            case "sauce":
//                break;
//            default:
//                throw new IllegalArgumentException("Cannot place " + type + " on top of your pizza");
//        }
        if(!TOPPING_TYPE_WITH_MODIFIERS.containsKey(toppingType)){
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight){
        if(weight<1||weight>50){
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range[1..50]");
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        return 2 * TOPPING_TYPE_WITH_MODIFIERS.get(this.toppingType) * this.weight;
    }
}

