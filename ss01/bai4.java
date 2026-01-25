package ss01;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá sách (USD)
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        // Nhập tỷ giá
        System.out.print("Nhập tỷ giá (kiểu float): ");
        float exchangeRate = sc.nextFloat();

        // Tính giá chính xác (double)
        double priceVND = priceUSD * exchangeRate;

        // Ép kiểu từ double sang long (làm tròn xuống)
        long roundedPrice = (long) priceVND;

        // Xuất kết quả
        System.out.println("Giá chính xác (số thực): " + priceVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedPrice);

        sc.close();
    }
}

