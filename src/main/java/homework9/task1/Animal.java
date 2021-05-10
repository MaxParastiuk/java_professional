package homework9.task1;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
 String color = "black";
 int weith = 10;
 String name = "Barsik";

    public Animal(String color, int weith, String name) {
        this.color = color;
        this.weith = weith;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weith == animal.weith && Objects.equals(color, animal.color) && Objects.equals(name, animal.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", weith=" + weith +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weith, name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeith() {
        return weith;
    }

    public void setWeith(int weith) {
        this.weith = weith;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
