package homework14.task2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Class1 extends Thread {
    private Thread t1;
    Lock l = new ReentrantLock();

    public Class1() {
    }

    public void setThread2(Thread t) {
        this.t1 = t;
    }


    @Override
    synchronized public void run() {
        System.out.println("Class1 start");
        if (!l.tryLock()) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println("Class1 finished");
    }
}
