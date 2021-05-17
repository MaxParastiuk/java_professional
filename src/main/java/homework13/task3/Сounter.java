package homework13.task3;

public class Сounter {
    int number;
    boolean aBoolean;

    synchronized void class1(){
        if(!aBoolean){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + ++number);
        aBoolean = false;
        notify();
    }

    synchronized void class2(){
        if(aBoolean){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + ++number);
        aBoolean = true;
        notify();
    }
}
