package javacore;

public class Calculator {

    public int add(int ... inputNums){
        int result = 0;

        for(int temp : inputNums){
            result = result + temp;
        }

        return result;
    }

}
