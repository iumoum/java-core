package javacore;

public class CountCreatedObject {

    public static void main(String[] args){
        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();

        Test.counter();
    }
}

class Test {
    static int createdCounter = 0;

    public Test(){
        createdCounter++;
    }

    public static void counter(){
        System.out.println(createdCounter);
    }
}
