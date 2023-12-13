package Advanced.Generics.Scale;

public class Person implements Comparable<Person> {
    private int weight;
    public Person(int weight){
        this.weight = weight;
    }
    @Override
    public int compareTo(Person other){
        return Integer.compare(this.weight,other.weight);
    }
}
