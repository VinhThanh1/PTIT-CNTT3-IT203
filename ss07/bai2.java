package ss07;

public class bai2 {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        //  BIẾN NGUYÊN THỦY
        int a = 10;
        int b = a;   // sao chép giá trị

        b = 20;

        System.out.println("Biến nguyên thủy:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        System.out.println("--------------------");

        // BIẾN THAM CHIẾU
        Student sv1 = new Student("Nam");
        Student sv2 = sv1; // sao chép địa chỉ

        sv2.name = "Huy";

        System.out.println("Biến tham chiếu:");
        System.out.println("sv1.name = " + sv1.name); // Huy
        System.out.println("sv2.name = " + sv2.name); // Huy
    }
}

//Biến nguyên thủy sao chép giá trị
//Biến tham chiếu sao chép địa chỉ
//Vì cùng trỏ tới một object trong Heap nên thay đổi qua một biến sẽ ảnh hưởng biến còn lại