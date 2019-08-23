package javacore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(4);

        System.out.println(linkedList.get(1));
    }
}
