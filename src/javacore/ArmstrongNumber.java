package javacore;

public class ArmstrongNumber {

    public static void main(String[] args){

        for(int inputNum = 1; inputNum <= 1000000000; inputNum++){
            if(printArmstrongNumber(inputNum)){
                System.out.println(inputNum);
            }
        }
    }

    public static boolean printArmstrongNumber(int inputNum){
        int eachNum;
        int temp = inputNum;
        int result = 0;

        while(temp > 0) {
            eachNum = temp % 10;
            temp = temp / 10;
            result = eachNum * eachNum * eachNum + result;
        }

        if(result == inputNum) {
            return true;
        } else {
            return false;
        }
    }
}
