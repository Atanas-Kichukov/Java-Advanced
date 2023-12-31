package Advanced.Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;
    public Box(){
        this.values = new ArrayList<>();
    }
    public void add (T input){
        this.values.add(input);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s",value.getClass().getName(), value));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
