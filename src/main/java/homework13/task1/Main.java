package homework13.task1;

public class Main extends Thread {
    public static void main(String[] args) {
        Thread main = new Thread(new Main(), "Main");
        Thread first = new Thread(new First(), "Waiter");
        Thread second = new Thread(new Second(), "Second");

        main.start();
        first.start();
        second.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " завершен");

    }
}

class First extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " завершен");
    }
}

class Second extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " завершен");
    }
}
