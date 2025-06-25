package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVien {
    private String fname;
    private int age;
    private String gender;
    private float salary;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public NhanVien(String fname, int age, String gender, float salary) {
        this.fname = fname;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void showProfile() {
        System.out.println(this.fname + "\n" + this.age + "\n" + this.gender + "\n" + this.salary);
    }

    public NhanVien() {
        super();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.fname = sc.next();
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        System.out.print("Nhap gioi tinh: ");
        this.gender = sc.next();
        System.out.print("Nhap luong: ");
        this.salary = sc.nextFloat();
    }
    public List<NhanVien> addList(){
        System.out.print("Nhap so luong nhan vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<NhanVien> list = new ArrayList<NhanVien>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien thu " + i);
            NhanVien nv = new NhanVien();
            nv.nhap();
            list.add(nv);
            System.out.println();
        }
        return list;
    }
    public void Xuat(List<NhanVien> list){
        for (NhanVien nv : list) {
            nv.showProfile();
        }
    }
    public static void main(String[] args) {


    }
}
