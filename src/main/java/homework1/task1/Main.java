package homework1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Labrador", 7, 25, 5000,"grey");
        Animal dog = new Animal("Labrador", 30, 25, 5000,"white");
        Animal bird = new Animal("Labrador", 15, 25, 5000,"black");

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
