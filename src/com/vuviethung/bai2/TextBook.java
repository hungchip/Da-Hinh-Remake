package com.vuviethung.bai2;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book{
    private int status;

    public TextBook(String maSach, Date ngayNhap, double donGia, double soLuong, String nhaXuatBan, int status) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.status = status;
    }

    public TextBook(int status) {
        this.status = status;
    }

    public TextBook(){
        super();
        this.status =0;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void nhapSach() {
        super.nhapSach();
        System.out.println("Nhap tinh trang: 0 || 1");
        this.status = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+
                "TextBook{" +
                "status=" + status +
                "thanh tien" + thanhTien()+
                '}';
    }

    @Override
    public double thanhTien() {
        if (this.status==0){
            return this.getSoLuong() * this.getDonGia() *0.5;
        }return this.getSoLuong() * this.getDonGia();
    }
}
