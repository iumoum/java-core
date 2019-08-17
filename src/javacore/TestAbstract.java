package javacore;

import java.util.Scanner;

public class TestAbstract {

    public static void main(String[] args) {
        String s1, s2, s3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 2 Strings");

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        s3 = s1.concat(s2);

        System.out.println("s1's length is " + s1.length() + ", s2's length is " + s2.length());
        System.out.println("Concatenation Result is " + s3);
        System.out.println("s1 UpperCase: " + s1.toUpperCase());


    }
}
