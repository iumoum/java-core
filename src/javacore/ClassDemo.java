package javacore;

import java.lang.reflect.Method;

class A {

}

class B extends A {

}

public class ClassDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("javacore.B");

        System.out.println(c.isInterface());        // 해당 클래스가 인터페이스인지 체크
        System.out.println(c.getSuperclass());      // 해당 클래스의 슈퍼 클래스를 보여줌
    }
}
