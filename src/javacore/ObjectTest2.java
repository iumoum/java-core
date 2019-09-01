package javacore;

class Objtest{
    Object object;
}

public class ObjectTest2 {
    public static void main(String[] args) {
        Member3 member = new Member3();

        ObjectTest objTest = new ObjectTest();

        objTest.object = member;
    }
}

class Member3{
    String name;
    int age;
}
