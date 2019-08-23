package javacore;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY;
}

/*// 위 enum은 컴파일 후 다음과 같은 클래스를 변환된다.
class Day{                                              // 날짜와 관련된 상수를 나열하기 위함이다.
    public final static Day MONDAY = new Day();         // 객체의 해쉬코드 값을 상수로 받는다.
    public final static Day TUESDAY = new Day();        // 만약 기본 타입을 상수로 설정할 경우 다른 종류의 상수, 즉 다른 클래스와 비교가 가능해질 수도 있기 때문이다.
    public final static Day WEDNESDAY = new Day();      // 다만 코딩할 때 이렇게 클래스로 정의하지 않는 이유는 이 열거형 상수들을 Switch문에서 사용하기 위함이다.
    public final static Day THURSDAY = new Day();       // 따라서 enum 타입을 정의해 상수들을 관리하면 해당 enum 타입을 swtich문에 사용할 수있다*/


public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);       // enum이 없었을 때 위와 같이 상수집합을 나열하였다.

        Day e = Day.MONDAY;

        switch(e){
            case MONDAY:
                System.out.println("Hello");
                break;
        }
    }
}
