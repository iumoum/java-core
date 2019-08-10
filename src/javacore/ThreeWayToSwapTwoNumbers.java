package javacore;

public class ThreeWayToSwapTwoNumbers {
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        // 서로의 반대값을 넣어주어 교환하는 방법

        a = a + b;  // 7
        b = a - b;  // 7 - 4 = 3,  a was 3
        a = a - b;  // 7 - 3 = 4,  b was 4

        // 위는 다음과 같다

        b = a + b - (a = b);   // 7 - 4(a라는 변수에 담겨있는 4)

        a = a ^ b;  // 011 XOR 100 = 111
        b = a ^ b; // 111 XOR 100 = 011
        a = a ^ b; // 111 XOR 011 = 100

        // 임시 변수를 만들어 교환하는 방법
        int temp = a;
        a = b;
        b = temp;

    }
}
