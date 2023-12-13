package JavaOOP.Polymorphism.VehiclesExtended;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    private static final double ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    public String driveBus(double distance) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        double consumption = distance * (this.fuelConsumption +=
                ADDITIONAL_CONSUMPTION_WITH_AIR_CONDITIONER);
        if (consumption > this.fuelQuantity) {
            return this.getClass().getSimpleName() + " needs refueling";
        } else {
            setFuelQuantity(this.fuelQuantity -= consumption);
            return String.format("%s travelled %s km", getClass().getSimpleName(),
                    formatter.format(distance));
        }
    }


}
