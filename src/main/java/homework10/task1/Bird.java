package homework10.task1;

import java.io.*;

public class Bird implements Serializable {
    private final int weight;
    private static String color;
    transient String name;


    public Bird(int weight, String name ) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Bird.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void writeObject(ObjectOutputStream oos)  {
        try {
            oos.defaultWriteObject();
            oos.writeObject(getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
     ois.defaultReadObject();
     this.name = (String) ois.readObject();
    }
}
