package com.vuviethung.bai4;

import java.net.HttpCookie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class QuanLyGiaoDich {
    private GiaoDich[] giaoDiches;
    private int soLuongGiaoDich;

    private static int demSoLuongGiaoDichDat = 0;
    private static int demsoLuongGiaoDichNha = 0;

    public QuanLyGiaoDich(int soLuongGiaoDich) {
        this.soLuongGiaoDich = soLuongGiaoDich;
        this.giaoDiches = new GiaoDich[this.soLuongGiaoDich];
    }


    public void nhapGiaoDich() {
        int luachon = 0;
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            do {
                System.out.println("Nhap lua chon");
                luachon = new Scanner(System.in).nextInt();
            } while (luachon != 1 && luachon != 2);
            switch (luachon) {
                case 1:
                    this.giaoDiches[i] = new GiaoDichDat();
                    this.giaoDiches[i].nhapGiaoDich();

                    break;
                case 2:
                    this.giaoDiches[i] = new GiaoDichNha();
                    this.giaoDiches[i].nhapGiaoDich();
                    break;
            }
        }
    }

    public void xuatGiaoDich() {
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            System.out.println(giaoDiches[i].toString());
        }
    }

    public void trungBinhThanhTien() {
        int tong1 = 0, tong2 = 0, dem1 = 0, dem2 = 0;
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            if (this.giaoDiches[i] instanceof GiaoDichDat) {
                tong1 += this.giaoDiches[i].thanhTien();
                dem1++;
            }
        }
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            if (this.giaoDiches[i] instanceof GiaoDichNha) {
                tong2 += this.giaoDiches[i].thanhTien();
                dem2++;
            }
        }
        System.out.println("trung binh thanh tien giao dich nha" + tong1 / dem1);
        System.out.println("trung binh thanh tien giao dich dat" + tong2 / dem2);
    }

    public void xuatGiaoDichThang92013() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleDateFormat.parse("dd/09/2013");
        for (int i = 0; i < this.soLuongGiaoDich; i++) {
            if (this.giaoDiches[i].getNgayGiaoDich().equals(date)) {
                System.out.println("aaaaa" + this.giaoDiches[i].toString());
            }
            System.out.println("bbbbbb");
        }
    }
}
