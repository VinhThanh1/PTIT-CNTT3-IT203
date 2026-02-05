package ss09;

public class bai4 {
    public static void main(String[] args) {

        Animal4 animal = new Dog4();

        animal.eat();
        animal.sound();

        if (animal instanceof Dog4) {
            Dog4 d = (Dog4) animal;
            d.bark();
        }

        Animal4 animal2 = new Cat4();
        animal2.sound();

        if (animal2 instanceof Dog4) {
            Dog4 d2 = (Dog4) animal2;
            d2.bark();
        } else {
            System.out.println("animal2 không phải Dog4 nên không ép kiểu được!");
        }
    }
}

class Animal4 {
    public void eat() {
        System.out.println("Animal đang ăn...");
    }

    public void sound() {
        System.out.println("Animal phát ra âm thanh...");
    }
}

class Dog4 extends Animal4 {
    @Override
    public void sound() {
        System.out.println("Gâu gâu!");
    }

    // phương thức riêng
    public void bark() {
        System.out.println("Dog sủa: GÂU GÂU GÂU!!!");
    }
}

class Cat4 extends Animal4 {
    @Override
    public void sound() {
        System.out.println("Meo meo!");
    }
}
