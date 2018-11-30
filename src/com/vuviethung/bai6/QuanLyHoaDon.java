package com.vuviethung.bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuanLyHoaDon {
    private HoaDon[] hoaDons;
    private int soLuongHoaDon;

    public QuanLyHoaDon(int soLuongHoaDon) {
        this.soLuongHoaDon = soLuongHoaDon;
        this.hoaDons = new HoaDon[this.soLuongHoaDon];
    }

    public void nhapDanhSachHoaDon() {
        int luachon = 0;
        for (int i = 0; i < this.soLuongHoaDon; i++) {
            do {
                System.out.println("Nhap lua chon");
                luachon = new Scanner(System.in).nextInt();
            } while (luachon != 1 && luachon != 2);
            switch (luachon) {
                case 1:
                    this.hoaDons[i] = new HoaDonTheoGio();
                    this.hoaDons[i].nhapHoaDon();
                case 2:
                    this.hoaDons[i] = new HoaDonTheoNgay();
                    this.hoaDons[i].nhapHoaDon();
            }
        }
    }

    public void xuatDanhSachHoaDon() {
        for (int i = 0; i < this.soLuongHoaDon; i++) {
            System.out.println(this.hoaDons[i].toString());
        }
    }

    public void tinhTrungBinhThanhTien() throws ParseException {
        int tong1=0,tong2 =0, dem1 = 0, dem2 = 0;
        String ngay = "1/9/2013";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        for (int i = 0; i < this.soLuongHoaDon; i++) {
            if (this.hoaDons[i].getNgayHoaDon().equals(date)){
                if (this.hoaDons[i] instanceof HoaDonTheoGio){
                    dem1++;
                    tong1 += this.hoaDons[i].thanhTien();
                }else{
                    dem2++;
                    tong2 += this.hoaDons[i].thanhTien();
                }
            }
        }
        System.out.println("trung binh thanh tien hoa don theo gio thang 9 2013 " + tong1/dem1);
        System.out.println("trung binh thanh tien hoa don theo ngay thang 9 2013" + tong2/dem2);

    }
}
