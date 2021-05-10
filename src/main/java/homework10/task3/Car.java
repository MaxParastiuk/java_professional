package homework10.task3;

public class Car implements Cloneable {
    private int year;
    private String brand;
    private int speed;

    public Car(int year, String brand, int speed) {
        this.year = year;
        this.brand = brand;
        this.speed = speed;
    }
    public Car() {}

    public static Car getInstanceMethod (Car carToCoppy){
        Car instance = new Car();
        instance.year = carToCoppy.year;
        instance.brand = carToCoppy.brand;
        instance.speed = carToCoppy.speed;
        return instance;
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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
