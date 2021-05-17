package homework13.task3;

public class Сlass2 extends Thread {
    Сounter c;
    int count;

    public Сlass2(Сounter c, int count) {
        this.c = c;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            c.class2();
        }
    }
}
