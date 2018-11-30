package com.vuviethung.bai4;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich(1);
        quanLyGiaoDich.nhapGiaoDich();
        quanLyGiaoDich.xuatGiaoDich();
        quanLyGiaoDich.trungBinhThanhTien();
        quanLyGiaoDich.xuatGiaoDichThang92013();
    }
}
