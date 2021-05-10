package homework9.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Black",9,"Barsik");
        File f = new File("C:\\Users\\User\\IdeaProjects\\java_professional\\src\\main\\java\\homework9\\cat.txt");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

            oos.writeObject(cat);

            Animal animal = (Animal) ois.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
