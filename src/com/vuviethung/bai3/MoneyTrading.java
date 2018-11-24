package com.vuviethung.bai3;

import java.util.Date;
import java.util.Scanner;

public class MoneyTrading extends Trading {
    private int tyGia;
    private int loaiTienTe;

    public MoneyTrading(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, int tyGia, int loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }

    public MoneyTrading(int tyGia, int loaiTienTe) {
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }

    public MoneyTrading(){
        super();
        this.tyGia = 0;
        this.loaiTienTe =0;
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("Nhap ty gia");
        this.tyGia = new Scanner(System.in).nextInt();
        System.out.println("Nhap loai tien te: 1 hoac 0");
        this.loaiTienTe = new Scanner(System.in).nextInt();
    }

    @Override
    public double thanhtien() {
        if (this.loaiTienTe ==1){
            return this.getSoLuong() * this.getDonGia() * tyGia;
        }return this.getSoLuong() * this.tyGia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "MoneyTrading{" +
                "tyGia=" + tyGia +
                ", loaiTienTe=" + loaiTienTe +
                '}';
    }
}
