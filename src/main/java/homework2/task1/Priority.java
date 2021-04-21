package homework2.task1;

import java.util.*;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < 10; i++) {
            pq.add((int) ((Math.random() * 100)));
        }
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll()+ " ");
        }
    }
}


