package homework9.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2, "BMW", 120);
        File f = new File("C:\\Users\\User\\IdeaProjects\\java_professional\\src\\main\\java\\homework9\\task2\\Car.txt");


        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            oos.writeObject(car);

            car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
