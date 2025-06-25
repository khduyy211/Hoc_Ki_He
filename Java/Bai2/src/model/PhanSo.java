package model;

import java.util.Scanner;

public class PhanSo {
    private int tu_so;
    private int mau_so;

    public PhanSo() {
        super();
    }

    public PhanSo(int tuso, int mauso) {
        super();
        this.tu_so = tuso;
        this.mau_so = mauso;
    }

    public int getTuso() {
        return tu_so;
    }

    public void setTuso(int tu_so) {
        this.tu_so = tu_so;
    }

    public int getMauso() {
        return mau_so;
    }

    public void setMauso(int mau_so) {
        this.mau_so = mau_so;
    }

    public void show() {
        System.out.println("Phân số: \n"+this.tu_so + "/" + this.mau_so);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập tử số:");
        this.tu_so = sc.nextInt();
        System.out.print("Vui lòng nhập mẫu số:");
        this.mau_so = sc.nextInt();
    }

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        p1.nhap();
        p1.show();
    }
}
