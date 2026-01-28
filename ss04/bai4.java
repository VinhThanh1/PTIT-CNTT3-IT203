package ss04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã thẻ thư viện:");
        String cardCode = sc.nextLine();

        // Regex tổng
        String fullRegex = "^[A-Z]{2}\\d{4}\\d{5}$";

        // Regex từng phần
        Pattern prefixPattern = Pattern.compile("^[A-Z]{2}");
        Pattern yearPattern = Pattern.compile("^[A-Z]{2}(\\d{4})");
        Pattern randomPattern = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");

        Matcher fullMatcher = Pattern.compile(fullRegex).matcher(cardCode);

        if (fullMatcher.matches()) {
            System.out.println("✅ Mã thẻ hợp lệ!");
            return;
        }

        // Kiểm tra tiền tố
        if (!prefixPattern.matcher(cardCode).find()) {
            System.err.println("Thiếu hoặc sai tiền tố (2 chữ cái in hoa)");
            return;
        }

        // Kiểm tra năm
        Matcher yearMatcher = yearPattern.matcher(cardCode);
        if (yearMatcher.find()) {
            int year = Integer.parseInt(yearMatcher.group(1));
            if (year < 2000 || year > 2100) {
                System.err.println("Năm không hợp lệ");
                return;
            }
        } else {
            System.err.println("Thiếu năm nhập học (4 chữ số)");
            return;
        }

        // Kiểm tra 5 số cuối
        if (!randomPattern.matcher(cardCode).matches()) {
            System.err.println("Phần 5 chữ số ngẫu nhiên không hợp lệ");
            return;
        }
    }
}
