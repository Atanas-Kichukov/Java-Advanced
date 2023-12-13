package JavaOOP.PriceCalculator;

public enum Discount {
    VIP(20),
    SECOND_VISIT(10),
    NONE(0);
    private final int discount;
    Discount(int discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }


}
