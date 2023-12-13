package Advanced.Generics.Scale;

public class Scale<E extends Comparable<E>> {
    private E left;
    private E right;

    public Scale(E left, E right){
        this.left = left;
        this.right = right;
    }
    public E getHeavier(){
        int i = this.left.compareTo(this.right);
        if(i>0){
            return this.left;
        }
        else{
            return this.right;
        }
    }
}
