package com.vuviethung.bai3;

import java.util.Date;
import java.util.Scanner;

public class GoldTrading extends Trading {
    private String loaiVang;

    public GoldTrading(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public GoldTrading(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GoldTrading(){
        super();
        this.loaiVang = "";
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("Nhap loai vang");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    @Override
    public double thanhtien() {
        return this.getSoLuong() * this.getDonGia();
    }

    @Override
    public String toString() {
        return super.toString()+
                "GoldTrading{" +
                "loaiVang='" + loaiVang + '\'' +
                "thanh tien" + thanhtien() +
                '}';
    }
}
