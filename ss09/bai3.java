package ss09;

public class bai3 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Nguyễn Văn B", 12000000, "Kế toán");
        m1.hienThiThongTin();
    }
}

class Employee {
    protected String ten;
    protected double luongCoBan;

    public Employee(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}

class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan); // bắt buộc là dòng đầu tiên
        this.phongBan = phongBan;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phòng ban: " + phongBan);
    }
}

