package ss01;

public class bai3 {
    public static void main(String[] args) {

        // Khai báo 2 biến String
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // In trước khi hoán đổi
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);

        // HOÁN ĐỔI
        // temp là biến tham chiếu tạm thời
        String temp = book1;
        book1 = book2;
        book2 = temp;

        // In sau khi hoán đổi
        System.out.println("Sau khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
    }
}

// Khi hoán đổi String, Java không hoán đổi nội dung trên Heap,mà chỉ thay đổi các biến tham chiếu trên Stack trỏ đến vùng nhớ Heap.

