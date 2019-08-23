package javacore;

class Abcd{
    public void run() throws InterruptedException {
        wait();
    }
}
public class ThreadJoinAliveDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            for(int i = 0; i < 5; i++){
                System.out.println("Hi");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {

            for(int i = 0; i < 5; i++){
                System.out.println("Hello");

            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        System.out.println(t1.isAlive());       // t1 쓰레드가 살아있는지 체크

        t1.join();      // t1 쓰레드가 죽을 때까지 기다림
        t2.join();

        System.out.println(t1.isAlive());

        System.out.println("End");
    }
}
