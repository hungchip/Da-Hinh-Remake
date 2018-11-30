package com.vuviethung.bai6;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(2);
        quanLyHoaDon.nhapDanhSachHoaDon();
        quanLyHoaDon.xuatDanhSachHoaDon();
        quanLyHoaDon.tinhTrungBinhThanhTien();
    }
}
