package com.vuviethung.bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoGio extends  HoaDon {
    private int soGioThue;

    public HoaDonTheoGio(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, int soGioThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(){
        super();
        this.soGioThue = 0;
    }
    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public void nhapHoaDon() {
        super.nhapHoaDon();
        System.out.println("Nhap so gio thue");
        this.soGioThue = new Scanner(System.in).nextInt();
    }

    @Override
    public double thanhTien() {
        if (this.soGioThue <=24){
            return this.soGioThue*this.getDonGia();
        }
        if (this.soGioThue>24 && this.soGioThue <=30){
            return this.getDonGia()*24;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
                "HoaDonTheoGio{" +
                "soGioThue=" + soGioThue +
                "thanh tien " + thanhTien() +
                '}';
    }
}
