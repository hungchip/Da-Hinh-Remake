package com.vuviethung.bai5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class KhachHang {
    private String maKhachHang;
    private String hoTen;
    private Date ngayRaHoaDon;
    private double soLuong;
    private double donGia;

    public KhachHang(String maKhachHang, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public KhachHang(){
        this.maKhachHang = "";
        this.hoTen = "";
        this.soLuong = 0;
        this.donGia = 0;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapKhachHang(){
        System.out.println("Nhap ma khach hang");
        this.maKhachHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap ho ten khach hang");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("nhap ngay ra hoa hon");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayRaHoaDon = dateFormat.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap so luong");
        this.soLuong = new Scanner(System.in).nextDouble();
        System.out.println("Nhap don gia ");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public abstract double thanhTien();
}
