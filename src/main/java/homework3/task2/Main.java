package homework3.task2;

public class Main {
    public static void main(String[] args) {
        myHashMap<String, String> map = new myHashMap<>();

        map.put("1","Москва");
        map.put("2","Киев");
        map.put("3", "Лондон");
        map.put("4", "Львов");

        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));
        System.out.println(map.get("4"));

        map.remove("1");
        map.remove("2");
        System.out.println();
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));
        System.out.println(map.get("4"));
        System.out.println(map.get("5"));
    }
}
