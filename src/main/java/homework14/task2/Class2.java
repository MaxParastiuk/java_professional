package homework14.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Class2 extends Thread {
    private Thread t2;
    Lock l = new ReentrantLock();

    public void setThread1(Thread t) {
        this.t2 = t;
    }

    public Class2() {

    }

    @Override
    synchronized public void run() {
        System.out.println("Class2 start");
        if (l.tryLock()) {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Class2 finished");
        }
    }
}
