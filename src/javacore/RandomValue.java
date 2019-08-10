package javacore;

import java.util.Random;

public class RandomValue {

    public static void main(String[] args){
        int[] intArr = new int[100000];

        Random r = new Random();

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = r.nextInt(9000);
        }

        for(int i : intArr){
            System.out.println(i);
        }

        try{
            System.out.println(intArr[1000000000]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("넘침");
        }
    }
}
