package javacore;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args){
        int inputNum;
        int temp;
        int result = 0;

        Scanner sc = new Scanner(System.in);

        inputNum = sc.nextInt();
        temp = inputNum;

       while(temp > 0){
           result = result * 10 + temp % 10 ;
           temp = temp / 10;
       }

       if(result == inputNum){
           System.out.println("It's Palindrome");
       } else {
           System.out.println("It's not Palindrome");
       }
    }
}
