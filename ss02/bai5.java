package ss02;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;   // điểm uy tín ban đầu
        int daysLate;      // số ngày trễ mỗi lần nhập

        System.out.println("Nhập lịch sử trả sách (999 để kết thúc)");

        while (true) {
            System.out.print("Nhập số ngày trễ: ");
            daysLate = sc.nextInt();

            // Mã thoát
            if (daysLate == 999) {
                break;
            }

            // Xử lý điểm uy tín
            if (daysLate <= 0) {
                score += 5;                 // trả đúng hoặc sớm
            } else {
                score -= daysLate * 2;      // trả muộn
            }
        }

        // In điểm cuối cùng
        System.out.println("Tổng điểm uy tín: " + score);

        // Xếp loại
        if (score > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (score >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }

        sc.close();
    }
}

