package JavaOOP.Encapsulation.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        setName(name);
        setCost(cost);

    }

    private  void  setName(String name){
        if(!stringValidator.nameValidator(name)){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
    private void  setCost(double cost){
        if(!MoneyValidator.isNotNegative(cost)){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
