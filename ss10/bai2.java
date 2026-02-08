package ss10;

public class bai2 {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bicycle("Giant");

        v1.showInfo();
        v2.showInfo();
    }
}

// Lớp trừu tượng
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // phương thức trừu tượng (bắt buộc lớp con phải viết)
    public abstract void move();

    // phương thức chung để in đúng format yêu cầu
    public void showInfo() {
        System.out.print(brand + " - Cách di chuyển: ");
        move();
    }
}

// Lớp Car
class Car extends Vehicle {

    public Car(String brand) {
        super(brand); // gọi constructor lớp cha
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}

// Lớp Bicycle
class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng sức người");
    }
}

