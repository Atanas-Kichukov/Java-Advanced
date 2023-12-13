package JavaOOP.Polymorphism.WildFarm;

public class Mouse extends Mammal {
    protected Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(getAnimalType() + " are not eating that type of food!");
        }
        super.eatFood(food);
    }
}
