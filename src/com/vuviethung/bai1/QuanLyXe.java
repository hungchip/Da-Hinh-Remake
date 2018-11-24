package com.vuviethung.bai1;

import java.util.Scanner;

public class QuanLyXe {
    private Xe[] xes;
    private int soLuongXe;

    public QuanLyXe(int soLuongXe) {
        this.soLuongXe = soLuongXe;
        this.xes = new Xe[this.soLuongXe];
    }

    public void nhapDanhSachXe(){
        int luachon =0;
        for (int i = 0; i < this.soLuongXe; i++) {
            do {
                System.out.println("Nhap lua chon: 1 || 2");
                luachon = new Scanner(System.in).nextInt();
            }while (luachon !=1 && luachon !=2);

            switch (luachon){
                case 1:
                    this.xes[i] = new XeNoiThanh();
                    xes[i].nhapXe();
                    break;
                case 2:
                    this.xes[i] = new XeNgoaiThanh();
                    xes[i].nhapXe();
                    break;
            }
        }
    }

    public void xuatDanhSachXe(){
        for (int i = 0; i < this.soLuongXe; i++) {
            System.out.println(xes[i].toString());
        }
    }
}
