package ss03;

public class bai3 {

    // In các sách có số lượng lớn nhất
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];

        // Tìm số lượng lớn nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }

    // In các sách có số lượng nhỏ nhất
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        // Tìm số lượng nhỏ nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("--------------------");
        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {

        // Khởi tạo mảng song song
        String[] names = {
                "Python Pro",
                "Web Design",
                "Java Core",
                "Data Structure",
                "AI Basic"
        };

        int[] quantities = {
                50,
                50,
                20,
                5,
                20
        };

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}

