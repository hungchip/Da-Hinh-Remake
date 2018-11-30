package com.vuviethung.bai5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class QuanLyKhachHang {
    private KhachHang[] khachHangs;
    private int soLuongKhachHang;

    public QuanLyKhachHang(int soLuongKhachHang){
        this.soLuongKhachHang = soLuongKhachHang;
        this.khachHangs = new KhachHang[this.soLuongKhachHang];
    }

    public void nhapDanhSachKhachHang(){
        int luachon=0;
        for (int i = 0; i < soLuongKhachHang; i++) {
            do {
                System.out.println("Nhap lua chon ");
                luachon = new Scanner(System.in).nextInt();
            }while (luachon !=1 && luachon !=2);
            switch (luachon){
                case 1:
                    this.khachHangs[i] = new KhachTrongNuoc();
                    this.khachHangs[i].nhapKhachHang();
                    break;
                case 2:
                    this.khachHangs[i] = new KhachNuocNgoai();
                    this.khachHangs[i].nhapKhachHang();
                    break;
            }
        }
    }

    public void xuatDanhSachKhachHang(){
        for (int i = 0; i < soLuongKhachHang; i++) {
            System.out.println(this.khachHangs[i].toString());
        }
    }

    public void tinhTrungBinhThanhTien(){
        int tong1=0,tong2=0,dem1=0,dem2=0;
        for (int i = 0; i < soLuongKhachHang; i++) {
            if (this.khachHangs[i] instanceof  KhachTrongNuoc){
                dem1++;
                tong1 += this.khachHangs[i].thanhTien();
            }else {
                dem2 ++;
                tong2 += this.khachHangs[i].thanhTien();
            }
        }
        System.out.println("trung binh thannh tien khach trong nuoc" + tong1);
        System.out.println("trung binh thanh tien khach nc ngoai" + tong2);
    }

    public void xuatHoaDonThang9() throws ParseException {

        String ngay ="11/09/2013";
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            dateFormat.parse(ngay);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        Date date =new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        for (int i = 0; i <  soLuongKhachHang; i++) {
            if (this.khachHangs[i].getNgayRaHoaDon().equals(date)){
                System.out.println(this.khachHangs[i].toString());
            }
            else{
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        }
    }
}
