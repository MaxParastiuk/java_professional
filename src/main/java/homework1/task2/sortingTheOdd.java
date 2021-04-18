package homework1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortingTheOdd {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Double> newArray = new ArrayList<>();

        ArrayList<Double> oddNums = new ArrayList<>();
        ArrayList<Double> evenNums = new ArrayList<>();

        for (double i : array) {
            if ((int) Math.floor(i) % 2 == 0) {
                evenNums.add(i);
            } else {
                oddNums.add(i);
            }
        }

        Collections.sort(oddNums);

        Collections.sort(evenNums);
        Collections.reverse(evenNums);

        newArray.addAll(oddNums);
        newArray.addAll(evenNums);


        Double[] sortedArray = newArray.toArray(new Double[0]);
        System.out.println(Arrays.toString(sortedArray));
    }
}
