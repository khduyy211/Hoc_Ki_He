package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String number;
    private double balance;
    private String cusName;
    private String cusEmail;
    private String cusPhone;

    public Account() {
        super();
    }

    public Account(String number, double balance, String cusName, String cusPhone, String cusEmail) {
        this.number = number;
        this.balance = balance;
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.cusEmail = cusEmail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    //method
    //Nap tien
    public void deposit(double money) {
        this.balance += money;
        System.out.println("Deposit of $" + money);
        System.out.println("Balance of $" + this.balance);
    }

    //Rut tien
    public void withdraw(double money) {
        if (this.balance - money < 0){
            System.out.println("Số dư không khả dụng");
            System.out.println(this.balance);
        }
        else {
            this.balance -= money;
            System.out.println("Rút thành công"+ money);
            System.out.println("Số dư còn lại"+ this.balance);
        }
    }
    public void nhapThongTinAccount(){
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        System.out.println("Nhập số thẻ:");
        ac.setNumber(sc.next());
        System.out.println("Nhập tên chủ thẻ:");
        ac.setCusName(sc.next());
        System.out.println("Nhập email chủ thẻ:");
        ac.setCusEmail(sc.next());
        System.out.println("Nhập số điện thoại chủ thẻ:");
        ac.setCusPhone(sc.next());
        System.out.println("Nhập số dư:");
        ac.setBalance(sc.nextDouble());

    }
    public void show(){
        System.out.println("Số thẻ: "+ this.getNumber());
        System.out.println("Tên chủ thẻ: "+ this.getCusName());
        System.out.println("Số điện thoại: "+ this.getCusPhone());
        System.out.println("Số dư: "+ this.getBalance());
    }

}
