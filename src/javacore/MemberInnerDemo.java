package javacore;

public class MemberInnerDemo {
    public static void main(String[] args) {
        Abcde abcde = new Abcde();

        Abcde.MemberInner memberInner = abcde.new MemberInner();

        memberInner.show();
        System.out.println(memberInner.getName());
    }
}

class Abcde{
    String name = "jiwan Kim";
    int age;

    class MemberInner{

        public void show(){
            System.out.println("it works");
        }

        public String getName(){
            return name;
        }
    }

}
