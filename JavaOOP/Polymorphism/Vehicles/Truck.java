package JavaOOP.Polymorphism.Vehicles;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption +
                ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(0.95 * liters);
    }
}
