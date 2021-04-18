package homework1.task3;

import java.lang.reflect.Type;
import java.util.ListIterator;

public class List extends MyArrayList<Type> {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Pig");
        list.add("Hamster");
        list.add("Wolf");

        System.out.println(list);

        list.set(1, "Dog");
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.indexOf("Wolf"));

        System.out.println(list.size());

        System.out.println(list.toString());

//        list.clear();
        System.out.println(list.size());

        System.out.println(list.isEmpty());

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

    }
}
