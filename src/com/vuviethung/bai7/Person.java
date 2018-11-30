package com.vuviethung.bai7;

import java.util.Scanner;

public abstract class Person {
    private String hoTen;
    private String diaChi;

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public Person() {
        this.hoTen = "";
        this.diaChi = "";
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        System.out.println("Nhap ho ten");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi ");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public abstract void danhGia();
}
