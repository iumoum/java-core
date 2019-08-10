package javacore;

import java.util.Arrays;

public class TwoDimensional {

    public static void main(String[] args){
        test(1,4,3,6,5,7,9);

    }

    public static void test(int ... a){
        for(int b : a){
            System.out.println(b);
        }
    }
}
