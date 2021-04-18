package homework1.task3;

public interface List<E> extends Iterable<E>  {
    boolean add(E e);
    void remove(int index);
    E get(int index);
    int size();
    void set(int index, E e);

}
