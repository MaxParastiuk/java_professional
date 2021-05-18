package homework14.task1;

public class Class2 extends Thread{
    private Thread t2;

    public void setThread1(Thread t){
      this.t2 = t;
    }
    public Class2() {

    }

    @Override
    public void run() {
       System.out.println("Class2 start");

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Class2 finished");
    }
}
