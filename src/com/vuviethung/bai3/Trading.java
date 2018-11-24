package com.vuviethung.bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Trading {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private int soLuong;

    public Trading(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public Trading(){
        this.maGiaoDich ="";
        this.donGia =0;
        this.soLuong =0;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
        System.out.println("nhap so luong");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhap don gia");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    public abstract double thanhtien();
    @Override
    public String toString() {
        return "Trading{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
