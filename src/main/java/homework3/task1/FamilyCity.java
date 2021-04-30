package homework3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FamilyCity {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();

        map.put("Ивановы","Москва");
        map.put("Петровы","Киев");
        map.put("Абрамовичи", "Лондон");
        System.out.println("Введите фамилию и узнайте где живет семья: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(reader.readLine()));
        }
    }
}
