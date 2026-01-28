package ss04;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu thô
        System.out.println("Nhập tên sách:");
        String bookName = sc.nextLine();

        System.out.println("Nhập tên tác giả:");
        String author = sc.nextLine();

        System.out.println("Nhập thể loại:");
        String category = sc.nextLine();

        // Làm sạch dữ liệu
        bookName = cleanSpace(bookName).toUpperCase();
        author = formatName(cleanSpace(author));
        category = cleanSpace(category);

        // Chuỗi tổng hợp
        String result = bookName + " - Tác giả: " + author;

        // Xuất kết quả
        System.out.println("Kết quả:");
        System.out.println(result);
    }

    // Hàm loại bỏ khoảng trắng thừa
    static String cleanSpace(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");

        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result.trim();
    }

    // Hàm viết hoa chữ cái đầu mỗi từ
    static String formatName(String name) {
        String[] words = name.toLowerCase().split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.substring(0, 1).toUpperCase()
                        + word.substring(1) + " ";
            }
        }
        return result.trim();
    }
}
