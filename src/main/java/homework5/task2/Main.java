package homework5.task2;

public class Main {
    public static void main(String[] args) {
        String Str = new String("В конце 1995 года язык программирования Java вырвался на просторы Интернета и моментально завоевал популярность.");

        for (String retval : Str.split("(?<=\\G.{57})", 2)) {
            System.out.println(retval);
        }
    }
}
