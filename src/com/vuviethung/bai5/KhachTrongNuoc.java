package com.vuviethung.bai5;

import java.util.Date;
import java.util.Scanner;

public class KhachTrongNuoc extends KhachHang {
    private String doiTuongKhachHang;
    private double dinhMuc;

    public KhachTrongNuoc(String maKhachHang, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia, String doiTuongKhachHang, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public KhachTrongNuoc(String doiTuongKhachHang, double dinhMuc) {
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public KhachTrongNuoc() {
        super();
        this.doiTuongKhachHang = "";
        this.dinhMuc = 0;
    }

    @Override
    public void nhapKhachHang() {
        super.nhapKhachHang();
        System.out.println("Nhap doi tuong khach hang");
        this.doiTuongKhachHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap dinh muc");
        this.dinhMuc = new Scanner(System.in).nextDouble();
    }

    @Override
    public double thanhTien() {
        if (this.getSoLuong() <= this.dinhMuc) {
            return getSoLuong() * getDonGia();
        }
        return this.getSoLuong() * this.getDonGia() * dinhMuc + (this.getSoLuong() - dinhMuc) * this.getDonGia() * 2.5;
    }

    @Override
    public String toString() {
        return super.toString()+
                "KhachTrongNuoc{" +
                "doiTuongKhachHang='" + doiTuongKhachHang + '\'' +
                ", dinhMuc=" + dinhMuc +
                "thanh tien" + thanhTien()+
                '}';
    }
}
