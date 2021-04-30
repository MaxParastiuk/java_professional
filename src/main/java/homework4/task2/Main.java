package homework4.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task2//task2.txt"), StandardCharsets.UTF_8));) {
            for (int i = 0; i < 10; i++) {
                bw.write((int) (Math.random() * 100));
            }
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task2//task2.txt"),
                StandardCharsets.UTF_8));) {
            int i = 0;
            int c;
            br.mark(11);

            while ((c = br.read()) != -1) {
                System.out.print(c + " ");
                i++;
            }
            System.out.println();

            int[] s = new int[i];
            br.reset();
            i = 0;
            while ((c = br.read()) != -1) {
                s[i] = c;
                i++;
            }
            Arrays.sort(s);
            System.out.println(Arrays.toString(s));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
