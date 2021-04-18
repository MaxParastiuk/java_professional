package homework1.task3;

import java.util.Arrays;
import java.util.Iterator;


public class MyArrayList<E> implements List<E> {
    public static void main(String[] args) {
        List<String> list = new MyArrayList<>();
        list.add("Pig");
        list.add("Hamster");
        list.add("Wolf");

        System.out.println(list);

        list.set(1, "Dog");
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.size());

        list.remove(1);
        System.out.println(list);



    }

    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] tmp = values;
            values = (E[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, values, 0, tmp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] tmp = values;
            values = (E[]) new Object[tmp.length - 1];
            System.arraycopy(tmp, 0, values, 0, index);
            int amountElemAfterIndex = tmp.length - index - 1;
            System.arraycopy(tmp, index + 1, values,index,amountElemAfterIndex );
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void set(int index, E e) {
        values[index] = e;
    }



    @Override
    public String toString() {
        return "MyArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
