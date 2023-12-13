package Advanced.Generics.Jar;

import java.util.ArrayDeque;

public class JarOfT<Type> {
    private ArrayDeque<Type> element;

    public JarOfT(){
        this.element = new ArrayDeque<>();
    }

    public void add(Type element){
        this.element.push(element);
    }
    public Type remove(){
        return this.element.pop();
    }
}
