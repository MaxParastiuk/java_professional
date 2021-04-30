package homework4.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("C://Users//User//IdeaProjects//java_professional//src//main//java//homework4//task3//task3.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(f, false));
        BufferedReader br = new BufferedReader(new FileReader(f));

        pw.write("В конце 1995 года язык программирования Java вырвался на просторы Интернета и моментально завоевал популярность.");
        pw.flush();
        pw.close();

        try {
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
