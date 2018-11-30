package com.vuviethung.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich{
    private int loaiDat;

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, int loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(){
        super();
        this.loaiDat =0;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("Nhap loai dat");
        this.loaiDat = new Scanner(System.in).nextInt();
    }

    @Override
    public double thanhTien() {
        if (loaiDat ==1){
            return this.getDienTich()*this.getDonGia() *1.5;
        }
        return this.getDienTich()*this.getDonGia();
    }

    @Override
    public String toString() {
        return super.toString()+
                "GiaoDichDat{" +
                "loaiDat=" + loaiDat +
                "thanh tien" + thanhTien() +
                '}';
    }

}
