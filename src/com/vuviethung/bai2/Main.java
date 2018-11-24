package com.vuviethung.bai2;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager(4);
        bookManager.nhapDanhSach();
        bookManager.xuatDanhSach();
        bookManager.timSachTheoNXB();
        bookManager.tinhTongTien();
        bookManager.trungBinhCongDonGiaSach();
    }
}
