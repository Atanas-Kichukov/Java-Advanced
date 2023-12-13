package JavaOOP.Polymorphism.VehiclesExtended;

public class Car extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption
                + ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER, tankCapacity);
    }
}
