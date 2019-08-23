package javacore;

import java.util.ArrayList;

class Container<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(ArrayList<T> list){
        System.out.println(value);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();

        container.setValue(7);

        container.show(new ArrayList<Integer>());
    }
}
