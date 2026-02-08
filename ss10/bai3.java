package ss10;

public class bai3 {
    public static void main(String[] args) {

        Duck vit = new Duck("Vịt Donald");
        Fish ca = new Fish("Cá Nemo");

        System.out.println("===== VỊT =====");
        vit.showName();
        vit.swim();
        vit.fly();

        System.out.println("\n===== CÁ =====");
        ca.showName();
        ca.swim();


    }
}

// Abstract class
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Tên: " + name);
    }
}

// Interface
interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

// Duck: là Animal + có thể bơi + có thể bay
class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi...");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang bay...");
    }
}

// Fish: là Animal + chỉ bơi được
class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi...");
    }
}
