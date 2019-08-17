package javacore;

import javasub.SubClass;

public class CountCreatedObject {

    public static void main(String[] args){
        Test test1 = new Test(1);
        Test test2 = new Test(2);
        Test test3 = new Test(3);

        CreateObject createObject = new CreateObject();

        Test.counter();

        SubClass subClass = new SubClass();
    }
}

class Test {
    static int createdCounter = 0;

    public Test(int b){
        createdCounter++;
        System.out.println("called constructor");
    }

    public static void counter(){
        System.out.println(createdCounter);
    }
}

class TestSub extends Test{
    public TestSub(int b){
        super(5);
        System.out.println("called contructor2");
    }
}
