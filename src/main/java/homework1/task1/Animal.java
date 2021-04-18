package homework1.task1;

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
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal)o).speed;

        if (tmp == 0) {
            if(this.price - ((Animal)o).price == 0){
                if (this.breed.compareTo(((Animal)o).breed) == 0){
                    return this.color.compareTo(((Animal)o).color);
                }
                return this.breed.compareTo(((Animal)o).breed);
            }
            return this.price - ((Animal)o).price;
        }
        else {
            return tmp;
        }
    }
}
