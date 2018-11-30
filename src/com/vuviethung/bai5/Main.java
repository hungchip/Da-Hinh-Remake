package com.vuviethung.bai5;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang(2);
        quanLyKhachHang.nhapDanhSachKhachHang();
        quanLyKhachHang.xuatDanhSachKhachHang();
        quanLyKhachHang.tinhTrungBinhThanhTien();
        quanLyKhachHang.xuatHoaDonThang9();
    }
}
