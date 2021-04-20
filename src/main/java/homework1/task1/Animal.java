package homework1.task1;

import java.util.Comparator;

public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;
    String color;

    Animal(String breed, int weight, int speed, int price, String color) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    //    public int compareTo(Object o) {
//        int tmp = this.speed - ((Animal)o).speed;
//
//        if (tmp == 0) {
//            if(this.price - ((Animal)o).price == 0){
//                if (this.breed.compareTo(((Animal)o).breed) == 0){
//                    return this.color.compareTo(((Animal)o).color);
//                }
//                return this.breed.compareTo(((Animal)o).breed);
//            }
//            return this.price - ((Animal)o).price;
//        }
//        else {
//            return tmp;
//        }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Animal::getPrice).thenComparing(Animal::getSpeed).
                thenComparing(Animal::getColor).compare(this, (Animal) o);
    }
}