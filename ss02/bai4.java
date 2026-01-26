package ss02;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookID;

        // Vòng lặp do-while để kiểm tra dữ liệu nhập
        do {
            System.out.print("Nhập mã ID sách (> 0): ");
            bookID = sc.nextInt();

            if (bookID <= 0) {
                System.out.println("Mã không hợp lệ, hãy nhập lại");
            }

        } while (bookID <= 0);

        // Khi thoát vòng lặp
        System.out.println("Lưu mã sách thành công");

        sc.close();
    }
}
