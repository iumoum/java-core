package javacore;

public class NestedClassDemo {
    public static void main(String[] args) {
        OutedNestedClass.InnerNestedClass inc = new OutedNestedClass.InnerNestedClass();

        inc.intro();
        OutedNestedClass.InnerNestedClass.show();


    }
}

class OutedNestedClass{

    static class InnerNestedClass{
        public void intro(){
            System.out.println("hello, it works");
        }

        public static void show(){
            System.out.println("it works too");
        }
    }
}
