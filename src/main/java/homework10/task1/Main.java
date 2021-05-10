package homework10.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(3,"Kesha");

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);


            oos.writeObject(bird);
            oos.flush();
            oos.close();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(inputStream);

            Bird cloneBird = (Bird) ois.readObject();
            System.out.println(cloneBird);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
