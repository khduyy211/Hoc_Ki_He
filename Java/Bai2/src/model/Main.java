package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        List<Account> list = new ArrayList<Account>();

        System.out.println("1. Tạo danh sách khách hàng");
        System.out.println("2. Xem danh sách");
        System.out.println("3. Rút tiền");
        System.out.println("4. Nạp tiền");
        System.out.println("0. Thoát");
        System.out.println("Vui lòng chọn phương thức bạn muốn sử dụng:");

        int chon = sc.nextInt();
        switch (chon) {
            case 0:
                break;
            case 1:
                System.out.println("Vui lòng nhập số lượng bạn muốn tạo:");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Tài khoản " + i);
                    ac.nhapThongTinAccount();
                    list.add(ac);
                }
                break;
            case 2:
                System.out.println("Danh sách khách hàng là: ");
                for (Account a : list) {
                    ac.show();
                }
                break;
            case 3:
                System.out.println("Vui lòng nhập số tiền bạn muốn rút: ");
                float money = sc.nextFloat();
                ac.deposit(money);
                System.out.println("Rút thành công!");
                ac.show();
                break;
            case 4:

                break;
        }


    }
}
