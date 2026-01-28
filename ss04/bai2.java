package ss04;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mô tả sách:");
        String description = sc.nextLine();

        // Kiểm tra có chứa "Kệ:" không
        if (description.contains("Kệ:")) {

            int start = description.indexOf("Kệ:") + 4;

            int end = description.indexOf(",", start);
            if (end == -1) {
                end = description.length();
            }

            String location = description.substring(start, end).trim();

            System.out.println("Mã vị trí kệ: " + location);

            // Thay thế từ khóa
            String newDescription =
                    description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mô tả mới:");
            System.out.println(newDescription);

        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}
