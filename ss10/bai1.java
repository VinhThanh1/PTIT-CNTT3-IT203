package ss10;

public class bai1 {
    public static void main(String[] args) {

        Shape hinhTron = new Circle(5);
        Shape hinhChuNhat = new Rectangle(4, 6);

        System.out.println("===== HÌNH TRÒN =====");
        System.out.println("Diện tích: " + hinhTron.getArea());
        System.out.println("Chu vi: " + hinhTron.getPerimeter());

        System.out.println("\n===== HÌNH CHỮ NHẬT =====");
        System.out.println("Diện tích: " + hinhChuNhat.getArea());
        System.out.println("Chu vi: " + hinhChuNhat.getPerimeter());
    }
}

// Interface chung
interface Shape {
    double getArea();
    double getPerimeter();
}

// Hình tròn
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Hình chữ nhật
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

