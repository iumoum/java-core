package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(15);
        l.add(4);
        l.add(6);
        l.add(98);
        l.add(115);

        Collections.sort(l, (o1, o2) -> {
            if(o1 > o2) {
                return 1;
            } else if(o1 < o2){
                return -1;
            }

            return 0;
        });

        for(int i : l){
            System.out.println(i);
        }
    }
}
