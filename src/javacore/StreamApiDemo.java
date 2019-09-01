package javacore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

interface LamdaTest {
    void lamdaTest();
}

class ObjectTest {
    Object object;
}

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(4);

        linkedList.forEach(MethodRefTest::printDouble);

        Stream<Integer> s = linkedList.stream();

        s.filter(i -> {
            System.out.println("HI");
            return true;
        }).findFirst();
    }
}

class MethodRefTest {
    public static void printDouble(int i){
        System.out.println(i * 2);
    }
}

class CC implements Consumer<Integer>{
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}
