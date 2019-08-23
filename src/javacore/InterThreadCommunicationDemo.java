package javacore;

class Q {
    int money;
    boolean hasSet = false;

    public synchronized void put(int money){

        while(hasSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.money = money;
        System.out.println("Put : " + this.money);

        hasSet = true;
        notify();
    }

    public synchronized void get(){

        while(!hasSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Get : " + this.money);

        hasSet = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "producer").start();
    }

    public void run(){
        int i = 0;

        while(true){
            q.put(i++);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run(){
        while(true){
            q.get();
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
