package Advanced.ExamPreperation.Halloween.halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid kid) {
        if (capacity > this.data.size()) {
            this.data.add(kid);
        }
    }

    public boolean removeKid(String name) {
        for (Kid kid : this.data) {
            if (kid.getName().equals(name)) {
                this.data.remove(kid);
                return true;
            }
        }
        return false;
    }

    public Kid getKid(String street) {
        Kid result = null;
        for (Kid kid : data) {
            if (kid.getStreet().equals(street)) {
                result = kid;
            }
        }
        return result;
    }
    public int getAllKids(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Children who visited a house for candy:%n"));
        for(Kid kid: data){
            sb.append(kid.toString()).append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
}
