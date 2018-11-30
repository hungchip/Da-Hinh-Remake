package com.vuviethung.bai4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich{
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public GiaoDich(){
        this.maGiaoDich ="";
        this.donGia =0;
        this.dienTich =0;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapGiaoDich(){
        System.out.println("Nhap ma giao dich");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay giao dich");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayGiaoDich = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap don gia");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhap dien tich ");
        this.dienTich = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }

    public abstract double thanhTien();

}
