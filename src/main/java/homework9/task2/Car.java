package homework9.task2;

import java.io.*;

public class Car implements Externalizable {
    int year;
    private String brand;
    int speed;

    public Car() {
    }

    public Car(int year, String brand, int speed) {
        this.year = year;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException, EOFException {
        out.writeInt(year);
        out.writeObject(brand);
        out.writeInt(speed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        year = in.readInt();
        brand = (String) in.readObject();
        speed = in.readInt();
    }
}
