package homework13.task3;



public class Main {
    public static void main(String[] args) {
        Сounter co = new Сounter();
        Class1 cl1 = new Class1(co,5);
        Сlass2 cl2 = new Сlass2(co,5);

        cl1.setName("Class1");
        cl2.setName("Class2");

        cl1.start();
        cl2.start();
    }
}
