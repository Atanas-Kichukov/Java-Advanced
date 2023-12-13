package Advanced.IteratorsAndComparators.Froggy;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Lake implements Iterable<Integer>{
    private  int[] stonesNumber;

    public Lake(int[]stonesNumber){
        this.stonesNumber = stonesNumber;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int index = 0;
            private int lastEvenIndex = stonesNumber.length % 2 ==0 ?
                    stonesNumber.length - 2 : stonesNumber.length - 1;
            @Override
            public boolean hasNext(){
                return this.index < stonesNumber.length;
            }
            @Override
            public Integer next(){

                if(this.index == lastEvenIndex){
                    int element = stonesNumber[lastEvenIndex];
                    this.index = 1;
                    return element;

                }
                int element = stonesNumber[index];
                this.index += 2;
                return element;
            }
        };
    }
}
