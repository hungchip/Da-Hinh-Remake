package com.vuviethung.bai2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private double soLuong;
    private String nhaXuatBan;

    public Book(String maSach, Date ngayNhap, double donGia, double soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public Book(){
        this.maSach = "";
        this.donGia =0;
        this.soLuong = 0;
        this.nhaXuatBan ="";
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhapSach(){
        System.out.println("Nhap ma sach");
        this.maSach = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay nhap");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayNhap = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap so luong");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhap don gia");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhap nha xuat ban");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach='" + maSach + '\'' +
                ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
    public abstract double thanhTien();
}
