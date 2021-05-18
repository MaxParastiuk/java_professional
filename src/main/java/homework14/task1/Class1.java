package homework14.task1;

public class Class1 extends Thread {
    private Thread t1;

    public Class1() {
    }

    public void setThread2(Thread t) {
        this.t1 = t;
    }

    @Override
    public void run() {
        System.out.println("Class1 start");

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
        System.out.println("Class1 finished");
    }
}
