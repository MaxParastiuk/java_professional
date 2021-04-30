package homework6.task1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "behind", newS = "Java";
        StringBuilder sb = new StringBuilder("Two people behind you in the lunch line yesterday. behind me");
        int i = 0;
        while ((i = sb.indexOf(s, i)) >= 0) {

            sb.delete(i, i + s.length());
            sb.insert(i, newS);
            i += newS.length();

        }
        System.out.println(sb);
    }
}
