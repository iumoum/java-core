package javacore;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        for(int i = 0; i < 1000000000; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int inputNum){
        for(int i = 2; i <= Math.sqrt(inputNum); i++){       // (inputNum / 2)  same as Math.sqrt(inputNum)
            if(inputNum % i == 0){
                return false;
            }
        }

        return true;
    }
}
