package JavaOOP.Polymorphism.VehiclesExtended;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;


    public Vehicle(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        setFuelQuantity(fuelQuantity);
    }
    public void setFuelQuantity(double fuelQuantity){
        validateFuelQuantity(fuelQuantity);
        this.fuelQuantity = fuelQuantity;
    }

    private void validateFuelQuantity(double fuelQuantity){
        if(fuelQuantity<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        else if (fuelQuantity > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
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
       validateFuelQuantity(liters);
       setFuelQuantity(this.fuelQuantity + liters);
    }


    @Override
    public String toString(){
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
