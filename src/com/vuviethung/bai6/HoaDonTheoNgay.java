package com.vuviethung.bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    public HoaDonTheoNgay(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, int soNgayThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public HoaDonTheoNgay() {
        super();
        this.soNgayThue = 0;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public void nhapHoaDon() {
        super.nhapHoaDon();
        System.out.println("Nhap so ngay thue");
        this.soNgayThue = new Scanner(System.in).nextInt();
    }

    @Override
    public double thanhTien() {
        if (this.soNgayThue <=7){
            return this.soNgayThue *this.getDonGia();
        }return  (this.soNgayThue -7)*this.getDonGia() *0.2+this.getDonGia()*7;
    }

    @Override
    public String toString() {
        return super.toString()+
                "HoaDonTheoNgay{" +
                "soNgayThue=" + soNgayThue +
                "thanh tien" + thanhTien()+
                '}';
    }
}
