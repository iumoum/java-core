package javacore;

enum Mobile{
    // 해당 enum에 명명된 클래스(Mobile)로 객체가 생성된다.
    // 중괄호를 이용하면 중괄호 내부의 값을 해당하는 생성자의 매개변수로 전달할 수 있다.
    APPLE(200), SAMSUNG, HTC(70);

    int price;

    Mobile() {                                          // enum에 나열한 상수들도 결국엔 객체이기 때문에 해당 enum은 생성자를 정의할 수 있다.
        System.out.println("No Args Constructor");
        this.price = 100;
        System.out.println("Price: " + this.price);
    }

    Mobile(int price) {
        System.out.println("Args Constructor");
        this.price = price;
        System.out.println("Price: " + this.price);
    }
}

public class EnumMemberDemo {
    public static void main(String[] args) {
        Mobile m = Mobile.APPLE;
    }
}
