package com.vuviethung.bai2;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {
    private double tax;

    public ReferenceBook(String maSach, Date ngayNhap, double donGia, double soLuong, String nhaXuatBan, double tax) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tax = tax;
    }

    public ReferenceBook(double tax) {
        this.tax = tax;
    }

    public ReferenceBook() {
        super();
        this.tax = 0;
    }

    @Override
    public void nhapSach() {
        super.nhapSach();
        System.out.println("Nhap thue");
        this.tax = new Scanner(System.in).nextDouble();
    }

    @Override
    public double thanhTien() {
        return this.getSoLuong() * this.getDonGia() + this.tax;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ReferenceBook{" +
                "tax=" + tax +
                "thanh tien" + thanhTien()+
                '}';
    }
}
