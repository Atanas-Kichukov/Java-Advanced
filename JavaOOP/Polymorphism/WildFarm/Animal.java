package JavaOOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String livingRegion;
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight,String livingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.livingRegion = livingRegion;
        this.foodEaten = 0;

    }

    public String getAnimalType() {
        return this.animalType;
    }

    public abstract void makeSound();
    public void eatFood(Food food){
        this.foodEaten +=  food.getQuantity();
    }

    @Override
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s]",
                this.animalType,
                this.animalName,
                formatter.format(this.animalWeight),
                this.livingRegion);
    }
}
