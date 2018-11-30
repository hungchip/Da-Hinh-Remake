package com.vuviethung.bai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon {
    private String maHoaDon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;

    public HoaDon(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public HoaDon() {
        this.maHoaDon = "";
        this.maPhong = "";
        this.tenKhachHang = "";
        this.donGia = 0;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapHoaDon(){
        System.out.println("Nhap ma hoa don");
        this.maHoaDon = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay ra hoa don");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayHoaDon = dateFormat.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap ten khach hang");
        this.tenKhachHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap ma phong ");
        this.maPhong = new Scanner(System.in).nextLine();
        System.out.println("Nhap don gia ");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayHoaDon=" + ngayHoaDon +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", donGia=" + donGia +
                '}';
    }
    public abstract double thanhTien();
}
