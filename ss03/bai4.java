package ss03;

public class bai4 {

    // Bubble Sort
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // In mảng
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] books = { 456789, 123456, 987654, 654321, 345678 };

        System.out.println("Danh sách ISBN trước khi sắp xếp:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("Danh sách ISBN sau khi sắp xếp tăng dần:");
        displayBooks(books);
    }
}
