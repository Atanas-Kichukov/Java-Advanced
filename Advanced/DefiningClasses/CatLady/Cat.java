package Advanced.DefiningClasses.CatLady;

public class Cat {
    private String breed;
    private String name;
    private double earFurOrDecibels;
    public Cat(String breed, String name, double earFurOrDecibels){
        this.breed = breed;
        this.name = name;
        this.earFurOrDecibels = earFurOrDecibels;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f",this.breed,this.name,this.earFurOrDecibels);
    }
}

