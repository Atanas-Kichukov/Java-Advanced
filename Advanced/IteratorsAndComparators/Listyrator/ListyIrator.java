package Advanced.IteratorsAndComparators.Listyrator;

import java.util.Iterator;
import java.util.List;

public class ListyIrator implements Iterable<String> {
    private List<String> data;
    private int index;


    public ListyIrator(List<String> data) {
        this.data = data;
        if (data.size() != 0) {
            this.index = 0;
        } else {
            this.index = -1;
        }
    }

    public boolean move() {

        if (this.index < data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public String print() {
        if (this.index == -1) {
            return "Invalid Operation!";
        }
        return this.data.get(this.index);
    }



    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;



            @Override
            public boolean hasNext() {
                return this.index <= data.size() - 1;

            }

            @Override
            public String next() {
                return data.get(this.index++);
            }
        };
    }
}

