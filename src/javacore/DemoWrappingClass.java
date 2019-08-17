package javacore;

import java.util.ArrayList;

public class DemoWrappingClass {

    public static void main(String[] args) {
        int i = 5;

        Integer ii = new Integer(i);    // Boxing
        Integer jj = i;                 // AutoBoxing

        int j = ii.intValue();          // Unboxing
        int k = jj;                     // AutoUnBoxing

        ArrayList<Integer> intArr = new ArrayList<>();

        intArr.add(5);                  //AutoUnboxing
    }
}
