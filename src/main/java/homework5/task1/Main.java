package homework5.task1;

public class Main {
    public static void main(String[] args) {
        String string = "Help me please";

        String[] parts = string.split(" ");

        StringBuilder swapped = new StringBuilder();
        if (parts.length > 1) {
            swapped.append(parts[parts.length - 1]).append(' ');
            for (int i = 1; i < parts.length - 1; i++) {
                swapped.append(parts[i]).append(' ');
            }
        }
        swapped.append(parts[0]);
        System.out.println(swapped);
    }
}
