package ss01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        // Tính tiền phạt gốc
        double total = n * m * 5000;
        System.out.println("Tiền phạt gốc: " + total + " VND");

        // Kiểm tra điều kiện
        if (n > 7 && m >= 3) {
            total = total * 1.2; // tăng 20%
        }

        System.out.println("Tiền phạt sau điều chỉnh: " + total + " VND");

        // Kiểm tra yêu cầu khóa thẻ
        boolean lockCard = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);

        sc.close();
    }
}

