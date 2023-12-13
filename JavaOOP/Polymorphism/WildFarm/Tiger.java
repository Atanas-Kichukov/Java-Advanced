package JavaOOP.Polymorphism.WildFarm;

public class Tiger extends Felime{


    protected Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
        if(food instanceof Vegetable){
            throw  new IllegalArgumentException("Tigers are not eating that type of food!");
        }


        super.eatFood(food);

    }
}
