package com.vuviethung.bai3;

import java.util.Scanner;

public class TradingManager {
    private Trading[] tradings;
    private int soLuongGiaoDich;

    public TradingManager(int soLuongGiaoDich) {
        this.soLuongGiaoDich = soLuongGiaoDich;
        this.tradings = new Trading[this.soLuongGiaoDich];
    }

    public void nhapDanhSachGiaoDich(){
        int luachon =0;
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            do {
                System.out.println("Nhap lua chon ");
                luachon = new Scanner(System.in).nextInt();
            }while (luachon!= 1 && luachon!=2);
            switch (luachon){
                case 1:
                    this.tradings[i] = new GoldTrading();
                    this.tradings[i].nhapGiaoDich();
                    break;
                case 2:
                    this.tradings[i] = new MoneyTrading();
                    this.tradings[i].nhapGiaoDich();
                    break;
            }
        }
    }

    public void xuatDanhSachGiaoDich(){
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            System.out.println(this.tradings[i].toString());
        }
    }

    public void trungBinhCong(){

        int tong1=0,tong2=0,dem1=0,dem2=0;
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            if (this.tradings[i] instanceof GoldTrading){
                dem1++;
                tong1+= this.tradings[i].thanhtien();
            }
            if (this.tradings[i] instanceof MoneyTrading){
                dem2++;
                tong2+= this.tradings[i].thanhtien();
            }
        }

        System.out.println("trung binh cong thanh tien gd vang" + tong1/dem1);
        System.out.println("trung binh cong thanh tien gd tien" + tong2/dem2);
    }

    public void timDonGia(){
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            if (this.tradings[i].getDonGia()>1000000000){
                System.out.println(this.tradings[i].toString());
            }
        }
    }
}
