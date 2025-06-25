import java.util.Scanner;

public class CauTrucDieuKhien {
    public static void main(String[] args) {
        System.out.print("Vui lòng nhập vào 1 số: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = n >= 2;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
//        if (flag)
//            System.out.println(n + " là số nguyên tố");
//        if (!flag)
//            System.out.println(n + " không phải là số nguyên tố");

        System.out.println(flag ? n + " là số nguyên tố" : n + " không phải là số nguyên tố");

    }
}
