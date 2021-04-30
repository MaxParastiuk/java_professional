package homework4.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task1//task1.txt");

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task1//task1.txt"), "UTF-8"));) {

            bw.write("Hello World");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task1//task1.txt"),
                "UTF-8"));) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
