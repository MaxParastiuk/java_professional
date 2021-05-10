package homework10.task2;

public class Eagle extends Animal{


    public Eagle(int age, int weight, String color) {
        super(age, weight, color);
    }
    public Eagle (Animal other){
        super(other.getAge(), other.getWeight(), other.getColor());
    }

}
