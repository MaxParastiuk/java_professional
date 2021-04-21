package homework2.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List {
    public static void main(String[] args) throws IOException {
        Set<String> list = new HashSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 100; i++) {
            String n = reader.readLine();
            if (n.equalsIgnoreCase("end")) {
                System.out.println("Выход выполнен");
                break;
            }
            list.add(n);
        }
        System.out.println(list);
    }
}
