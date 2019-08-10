package javacore;

public class PerfectNumber {
    public static void main(String[] args){

        for(long inputNum = 2l; inputNum <= 10000000000000l; inputNum++ ) {
            long result = 0l;

            for(long i = 1; i < inputNum; i++){
                if(inputNum % i == 0){
                    result += i;
                }
            }

            if(inputNum == result){
                System.out.println(inputNum);
            }
        }
    }
}
