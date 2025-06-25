import java.util.*;
public class BaiTapKiNang1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bạn có thể gọi từng hàm ở đây để chạy thử
        bai1(sc);
        bai2(sc);
        bai3(sc);
        bai4(sc);
        bai5(sc);
        bai6(sc);
        bai7(sc);
        bai8(sc);
        bai9(sc);
        bai10(sc);
        bai11(sc);
        bai12(sc);
        bai13(sc);

        sc.close();
    }

    // 1. Chia lấy phần nguyên và dư
    static void bai1(Scanner sc) {
        System.out.println("Bài 1:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Phần nguyên: " + (a / b));
        System.out.println("Phần dư: " + (a % b));
    }

    // 2. Trung bình cộng 4 số
    static void bai2(Scanner sc) {
        System.out.println("Bài 2:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.println("TBC = " + (a + b + c + d) / 4.0);
    }

    // 3. Tổng giờ phút giây
    static void bai3(Scanner sc) {
        System.out.println("Bài 3:");
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
        int tong = h * 3600 + m * 60 + s;
        System.out.println("Tổng giây: " + tong);
    }

    // 4. Tổng chữ số
    static void bai4(Scanner sc) {
        System.out.println("Bài 4:");
        int n = sc.nextInt();
        int tong = n / 10 + n % 10;
        System.out.println("Tổng chữ số: " + tong);
    }

    // 5. Kiểm tra chẵn
    static void bai5(Scanner sc) {
        System.out.println("Bài 5:");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Chẵn" : "Lẻ");
    }

    // 6. Tổng > 10?
    static void bai6(Scanner sc) {
        System.out.println("Bài 6:");
        int n = sc.nextInt();
        int tong = n / 10 + n % 10;
        System.out.println(tong > 10 ? "Tổng > 10" : "Tổng <= 10");
    }

    // 7. Hiệu < 0?
    static void bai7(Scanner sc) {
        System.out.println("Bài 7:");
        int n = sc.nextInt();
        int hieu = n / 10 - n % 10;
        System.out.println(hieu < 0 ? "Hiệu < 0" : "Hiệu >= 0");
    }

    // 8. Đối xứng không?
    static void bai8(Scanner sc) {
        System.out.println("Bài 8:");
        int n = sc.nextInt();
        System.out.println(n / 10 == n % 10 ? "Đối xứng" : "Không đối xứng");
    }

    // 9. In số lớn nhất
    static void bai9(Scanner sc) {
        System.out.println("Bài 9:");
        int n = sc.nextInt();
        int max = Math.max(n / 10, n % 10);
        System.out.println("Số lớn nhất: " + max);
    }

    // 10. Nghịch đảo
    static void bai10(Scanner sc) {
        System.out.println("Bài 10:");
        int n = sc.nextInt();
        int dao = (n % 10) * 10 + n / 10;
        System.out.println("Nghịch đảo: " + dao);
    }

    // 11. Tăng dần
    static void bai11(Scanner sc) {
        System.out.println("Bài 11:");
        int n = sc.nextInt();
        int a = n / 10, b = n % 10;
        System.out.println("Tăng dần: " + Math.min(a, b) + "" + Math.max(a, b));
    }

    // 12. Giảm dần
    static void bai12(Scanner sc) {
        System.out.println("Bài 12:");
        int n = sc.nextInt();
        int a = n / 10, b = n % 10;
        System.out.println("Giảm dần: " + Math.max(a, b) + "" + Math.min(a, b));
    }

    // 13. Giải PT bậc nhất ax + b = 0
    static void bai13(Scanner sc) {
        System.out.println("Bài 13:");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) System.out.println("Phương trình vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Nghiệm x = " + (-b / a));
        }
    }
}
