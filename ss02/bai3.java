package ss02;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sách trả muộn
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0; // biến tích lũy tổng tiền phạt

        // Vòng lặp for từ 1 đến n
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int daysLate = sc.nextInt();

            // Tiền phạt của 1 cuốn = số ngày trễ * 5000
            total += daysLate * 5000;
        }

        // In tổng tiền phạt
        System.out.println("Tổng tiền phạt: " + total + " VNĐ");

        sc.close();
    }
}

