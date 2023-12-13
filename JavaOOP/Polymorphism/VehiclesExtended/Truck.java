package JavaOOP.Polymorphism.VehiclesExtended;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption +
                ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(0.95 * liters);
    }
}
