package javacore;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {                  // Runnable Interface가 Functional Interface 즉 Single Abstract Method 인터페이스이기 때문에 람다표현식으로 객체 생성이 가능하다.
            for(int i = 0; i < 5; i++){                 // 람다표현식으로 생성된 객체를 쓰레드 연결할 때 한번만 사용할 것이기 때문에 익명객체로 표현한다.
                System.out.println("Hi2");
            }
        });                                             // Runnable 인터페이스는 run 메서드 밖에 없기 때문에 쓰레드 객체를 만들고 서로를 연결해줘야 한다.
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello2");
            }
        });

        t1.start();
        t2.start();

    }
}
