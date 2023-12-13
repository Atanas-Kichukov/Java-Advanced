package JavaOOP.Polymorphism.WildFarm;

public abstract class Food {
    protected Integer quantity;
    public Food(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
