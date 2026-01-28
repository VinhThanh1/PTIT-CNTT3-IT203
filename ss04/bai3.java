package ss04;

public class bai3 {
    public static void main(String[] args) {

        // Danh sách giao dịch
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        // ================== STRINGBUILDER ==================
        long startSB = System.currentTimeMillis();

        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: 24/01/2026\n");

        for (String t : transactions) {
            reportSB.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();

        // ================== STRING (+) ==================
        long startS = System.currentTimeMillis();

        String reportS = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportS += "Ngày tạo: 24/01/2026\n";

        for (String t : transactions) {
            reportS += "Giao dịch: " + t + "\n";
        }

        long endS = System.currentTimeMillis();

        // ================== IN KẾT QUẢ ==================
        System.out.println(reportSB);

        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: "
                + (endS - startS));
    }
}
