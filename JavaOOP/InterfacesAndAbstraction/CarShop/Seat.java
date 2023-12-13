package JavaOOP.InterfacesAndAbstraction.CarShop;

import JavaOOP.InterfacesAndAbstraction.CarShopExtended.Sellable;

public class Seat implements Car, Sellable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced,double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }
    @Override
    public String toString(){
        return "This is " + model + " produced in " + countryProduced + " and have 4 tires";
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
