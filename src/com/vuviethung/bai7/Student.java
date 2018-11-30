package com.vuviethung.bai7;

import java.util.Scanner;

public class Student extends Person {
    private double diemMon1;
    private double diemMon2;

    public Student(String hoTen, String diaChi, double diemMon1, double diemMon2) {
        super(hoTen, diaChi);
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    public Student(double diemMon1, double diemMon2) {
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    public Student(){
        super();
        this.diemMon1 = 0;
        this.diemMon2 = 0;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap diem mon 1");
        this.diemMon1 = new Scanner(System.in).nextDouble();
        System.out.println("Nhap diem mon 2");
        this.diemMon2 = new Scanner(System.in).nextDouble();
    }

    public double tinhDiemTB() {
        return (diemMon2 +diemMon1)/2;
    }

    @Override
    public void danhGia() {
        if (this.tinhDiemTB()<=5){
            System.out.println("trung binh");
        }
        if (this.tinhDiemTB()>5 && tinhDiemTB() <7){
            System.out.println("kha");
        }else
            System.out.println("gioi");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Student{" +
                "diemMon1=" + diemMon1 +
                ", diemMon2=" + diemMon2 +
                "diem trung binh" + tinhDiemTB()+
                "danh gia" + 
                '}';
    }
}
