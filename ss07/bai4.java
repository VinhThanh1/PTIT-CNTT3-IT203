package ss07;

public class bai4 {

    static class ClassRoom {

        // Biến static – quỹ lớp (dùng chung)
        private static double classFund = 0;

        // Biến instance
        private String studentName;

        // Constructor
        public ClassRoom(String studentName) {
            this.studentName = studentName;
        }

        // Đóng tiền vào quỹ lớp
        public void dongQuy(double amount) {
            if (amount > 0) {
                classFund += amount;
                System.out.println(studentName + " đã đóng: " + amount);
            } else {
                System.out.println("Số tiền không hợp lệ!");
            }
        }

        // Xem tổng quỹ lớp
        public static void xemTongQuy() {
            System.out.println("👉 Tổng quỹ lớp hiện tại: " + classFund);
        }
    }

    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Nam");
        ClassRoom sv2 = new ClassRoom("Huy");
        ClassRoom sv3 = new ClassRoom("Lan");

        sv1.dongQuy(100_000);
        sv2.dongQuy(150_000);
        sv3.dongQuy(200_000);

        System.out.println();
        ClassRoom.xemTongQuy();
    }
}
