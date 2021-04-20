package homework2.task2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MinimumN {


    public static void main(String[] args) {
        System.out.println("Введите количество елементов: ");
        List<Integer> list = new LinkedList<>();
        getIntegerList(list);
        System.out.println(list);
        System.out.println(getMinimum(list));

    }

    static Scanner in = new Scanner(System.in);


    public static void getIntegerList(List list) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }

    public static Comparable getMinimum(List list) {
        return Collections.min(list);
    }
}

