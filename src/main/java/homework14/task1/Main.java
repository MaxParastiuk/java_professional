package homework14.task1;

public class Main {
    public static void main(String[] args) {
        Class1 cl1 = new Class1();
        Class2 cl2 = new Class2();

        cl1.setThread2(cl2);
        cl2.setThread1(cl1);

        cl1.start();
        cl2.start();
    }
}
