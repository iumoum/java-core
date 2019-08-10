package javacore;

import java.util.Scanner;

public class CreateObject {

    public static void main(String ... args){

        String temp;
        int[] tempIntArr = new int [10];
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        temp = scanner.next();

        int i = 0;

        while(!"end".equals(temp)){


            try {
                tempIntArr[i] = Integer.valueOf(temp);
                temp = scanner.next();
            } catch(Exception e){
                System.out.println("It's not a int");
            }

            i++;
        }

        System.out.println(calculator.hashCode());
        System.out.println(calculator.add(tempIntArr));

    }
}
