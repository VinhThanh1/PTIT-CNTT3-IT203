package ss03;

import java.util.Scanner;

public class bai2 {

    // Hàm tìm kiếm tuyến tính
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i; // tìm thấy → trả về vị trí
            }
        }
        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo sẵn danh sách sách
        String[] books = {
                "Doraemon",
                "One Piece",
                "Naruto",
                "Dragon Ball",
                "Harry Potter"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String searchName = sc.nextLine();

        int index = searchBooks(books, searchName);

        if (index != -1) {
            System.out.println("Tìm thấy sách '" + searchName + "' tại vị trí số: " + index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
