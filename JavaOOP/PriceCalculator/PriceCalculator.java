package JavaOOP.PriceCalculator;

public class PriceCalculator {
    private Seasons seasons;
    private Discount discount;
    private double pricePerDay;
    private int days;


    public PriceCalculator(Seasons seasons, Discount discount, double pricePerDay, int days) {
        this.seasons = seasons;
        this.discount = discount;
        this.pricePerDay = pricePerDay;
        this.days = days;
    }

    public double calculatePrice() {
        return this.days * this.pricePerDay * this.seasons.getMultiplier()
                * (1.00 - (this.discount.getDiscount() / 100.00));
    }
}
