package JavaOOP.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {

        double neededFuel = fuelConsumption * distance;
        if (this.fuelQuantity >= neededFuel){
            DecimalFormat formatter = new DecimalFormat("##.##");
            fuelQuantity -= neededFuel;
            return  String.format("%s traveled %s km",this.getClass().getSimpleName(),formatter.format(distance));
        }else {
           return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
    }

    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
