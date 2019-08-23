package javacore;

abstract class OutedAnonymousInnerClass{
    public void show(){
        System.out.println("Hello");
    }

    abstract void test();
}


public class AnonyInnerClassDemo {
    public static void main(String[] args) {
        OutedAnonymousInnerClass oac = new OutedAnonymousInnerClass(){      // 익명 클래스를 만드려면 상속받거나 구현할 클래스 또는 인터페이스가 있어야한다.
            @Override
            public void show() {
                System.out.println("hi");
            }

            @Override
            void test() {
                System.out.println("123");
            }

        };

        oac.show();
        oac.test();
    }
}
