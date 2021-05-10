package homework10.task3;

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car(2020,"BWM",200);
        try {
            Car cloneCar = (Car) originalCar.clone();
            System.out.println(originalCar);
            System.out.println("Shallow cloning " + cloneCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Car cloneCar1 = Car.getInstanceMethod(originalCar);
        System.out.println("Deep cloning " + cloneCar1);
    }
}
