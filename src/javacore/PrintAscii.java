package javacore;

public class PrintAscii {

    public static void main(String[] args){

        for(int i = 0; i < 128; i++) {
            System.out.println((char) i + ": " + i);
        }
    }
}
