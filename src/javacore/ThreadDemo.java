package javacore;

class Hi extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
            try{Thread.sleep(20);}catch(Exception e){}
        }
    }
}

class Hello extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();     // Thread의 run 메서드를 호출함
        hello.start();
    }
}
