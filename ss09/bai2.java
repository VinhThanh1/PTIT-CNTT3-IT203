package ss09;

public class bai2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog
        a2.sound(); // Cat
    }
}

class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Gâu gâu!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meo meo!");
    }
}

