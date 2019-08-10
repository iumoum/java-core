package javacore;

import java.util.Scanner;

public class LoopPattern {

    public static void main(String[] args){

        int nextInt = 1;
        int previousInt = 0;
        int currentInt = 0;
        int limitInt;

        Scanner scanner = new Scanner(System.in);
        limitInt = scanner.nextInt();

        while(currentInt < limitInt){
            System.out.print(currentInt + " ");

            previousInt = currentInt;
            currentInt = previousInt + nextInt;
            nextInt = previousInt;

        }
    }
}
