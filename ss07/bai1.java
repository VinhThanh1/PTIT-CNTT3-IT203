package ss07;

public class bai1 {

    static class Student {
        // Biến instance
        private String maSV;
        private String tenSV;

        // Biến static
        private static int totalStudent = 0;

        // Constructor
        public Student(String maSV, String tenSV) {
            this.maSV = maSV;
            this.tenSV = tenSV;
            totalStudent++;
        }

        // Hiển thị thông tin sv
        public void hienThiThongTin() {
            System.out.println("Mã SV: " + maSV);
            System.out.println("Tên SV: " + tenSV);
        }

        // Hiển thị tổng số sv
        public static void hienThiTongSoSV() {
            System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
        }
    }

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn A");
        Student sv2 = new Student("SV002", "Trần Thị B");
        Student sv3 = new Student("SV003", "Lê Văn C");

        sv1.hienThiThongTin();
        System.out.println();

        sv2.hienThiThongTin();
        System.out.println();

        sv3.hienThiThongTin();
        System.out.println();

        Student.hienThiTongSoSV();
    }
}
