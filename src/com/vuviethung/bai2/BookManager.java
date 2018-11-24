package com.vuviethung.bai2;

import java.util.Scanner;

public class BookManager {
    private Book[] books;
    private int soLuongSach;

    public static double tongTienSachGiaoKhoa = 0;
    public static double tongTienSachThamKhao = 0;

    public static int demSachgiaoKhoa = 0;
    public static int demSachThamKhao = 0;

    public BookManager(int soLuongSach) {
        this.soLuongSach = soLuongSach;
        this.books = new Book[this.soLuongSach];
    }

    public void nhapDanhSach() {
        int luachon = 0;
        for (int i = 0; i < this.soLuongSach; i++) {
            do {
                System.out.println("Nhap lua chon 1 || 2");
                luachon = new Scanner(System.in).nextInt();
            } while (luachon != 1 && luachon != 2);
            if (luachon == 1) {
                this.books[i] = new TextBook();
                this.books[i].nhapSach();
            } else {
                this.books[i] = new ReferenceBook();
                this.books[i].nhapSach();
            }
        }
    }

    public void xuatDanhSach() {
        for (int i = 0; i < this.soLuongSach; i++) {
            System.out.println(books[i].toString());
        }
    }

    public void tinhTongTien() {
        for (int i = 0; i < this.soLuongSach; i++) {
            if (this.books[i] instanceof TextBook) {
                demSachgiaoKhoa++;
                tongTienSachGiaoKhoa += this.books[i].thanhTien();
            }
            if (this.books[i] instanceof ReferenceBook) {
                demSachThamKhao++;
                tongTienSachThamKhao += this.books[i].thanhTien();
            }
        }

        System.out.println("tong tien Sach Giao khoa" + tongTienSachGiaoKhoa);
        System.out.println("tong tien Sach tham Khao" + tongTienSachThamKhao);
    }

    public void trungBinhCongDonGiaSach() {
        System.out.println("tbc don gia sach giao khoa" + tongTienSachGiaoKhoa/demSachgiaoKhoa);
        System.out.println("tbc don gia sach tham Khao" + tongTienSachThamKhao/demSachThamKhao);
    }

    public void timSachTheoNXB(){
        System.out.println("nhap NXB");
        for (int i = 0; i < this.soLuongSach; i++) {

            String NXB  = new Scanner(System.in).nextLine();
            if (this.books[i] instanceof TextBook){
                if (this.books[i].getNhaXuatBan().equals(NXB)){
                    System.out.println(this.books[i].toString());
                }
            }
            if (this.books[i] instanceof ReferenceBook){
                if (this.books[i].getNhaXuatBan().equals(NXB)){
                    System.out.println(this.books[i].toString());
                }
            }
        }
    }
}
