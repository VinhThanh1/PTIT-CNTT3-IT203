package ss03;

import java.util.Scanner;

public class bai5 {

    // Hàm xóa bookId khỏi mảng, trả về n mới
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;

        // Tìm vị trí cần xóa
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy mã sách cần xóa.");
            return n;
        }

        // Dồn trái
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa mã sách: " + bookId);
        return n - 1; // giảm kích thước logic
    }

    // In mảng tới n phần tử
    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = { 101, 102, 103, 104, 105 };
        int n = 5;

        while (n > 0) {
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa: ");
            int bookId = Integer.parseInt(sc.nextLine());

            n = deleteBook(books, n, bookId);

            if (n == 0) {
                System.out.println("Không còn sách nào trong danh sách.");
                break;
            }

            System.out.print("Bạn có muốn xóa tiếp không? (y/n): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
