package JavaOOP.Polymorphism.CardSuit;

public class main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for(CardSuit suit : CardSuit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n"
                    ,suit.ordinal(),suit);
        }
    }
}
