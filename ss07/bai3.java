package ss07;

public class bai3 {

    static class ScoreUtils {

        // Kiểm tra đạt hay trượt
        public static boolean checkPass(double score) {
            return score >= 5.0;
        }

        // Tính sum
        public static double calculateAverage(double[] scores) {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            return sum / scores.length;
        }
    }

    // HÀM MAIN
    public static void main(String[] args) {

        // Danh sách điểm mẫu
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println();
        System.out.println(">> Kết quả xử lý:");

        // Gọi static method qua tên lớp
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Điểm " + score + ": Đạt");
            } else {
                System.out.println("- Điểm " + score + ": Trượt");
            }
        }
    }
}
