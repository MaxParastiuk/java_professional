package homework10.task2;

public class Main {
    public static void main(String[] args) {
        Eagle originalEagle = new Eagle(5,20,"grey");
        Eagle clonEagel = new Eagle(originalEagle);

        System.out.println(originalEagle);
        System.out.println(clonEagel);
    }
}
