package JavaOOP.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    private void setName(String name) {
        if (!stringValidator.nameValidator(name)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (!MoneyValidator.isNotNegative(money)) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            this.products.add(product);
            this.money -= product.getCost();
        } else {
            throw new IllegalArgumentException(name + " can't afford " + product.getName());
        }
    }

    @Override
    public String toString() {
        String productOutput = this.products.isEmpty() ? "Nothing bought" :
                this.products.stream().map(p -> p.getName())
                        .collect(Collectors.joining(", "));
        return name + " - " + productOutput;
    }
}
