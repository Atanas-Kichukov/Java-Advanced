package JavaOOP.PriceCalculator;

public enum Seasons {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int multiplier;

    Seasons(int multiplier){
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return this.multiplier;
    }
}
