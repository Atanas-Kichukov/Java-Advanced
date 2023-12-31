package JavaOOP.Working_With_Abstraction.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice(){
        return this.pricePerDay * this.numberOfDays
                * this.season.getMultiplier() * (1 - this.discountType.getDiscount() / 100.0);
    }
}