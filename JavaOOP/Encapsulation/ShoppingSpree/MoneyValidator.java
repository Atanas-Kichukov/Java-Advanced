package JavaOOP.Encapsulation.ShoppingSpree;

public class MoneyValidator {



    private MoneyValidator(){

    }
    public static boolean isNotNegative(double val) {
        return val >= 0;
    }
}
