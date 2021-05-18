package homework14.task3;

public class Daemon extends Thread {
    public Daemon() {
    }

    @Override
    public void run() {

           try {
               if(isDaemon()){
                   System.out.println("Daemon Thread start");
                   for (int i = 0; i < 100; i++) {
                       System.out.println(i);
                   }

               } else {
                   sleep(10);
                   System.out.println("Usual Thread start");
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               if(!isDaemon()){
                   System.out.println("Usual Thread finished");
               } else {
                   System.out.println("Daemon Thread finished ");
               }
           }
       }
    }

