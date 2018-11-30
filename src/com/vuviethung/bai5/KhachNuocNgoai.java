package com.vuviethung.bai5;

import java.util.Date;
import java.util.Scanner;

public class KhachNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachNuocNgoai(String maKhachHang, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai() {
        super();
        this.quocTich = "";
    }

    @Override
    public void nhapKhachHang() {
        super.nhapKhachHang();
        System.out.println("Nhap quoc tich");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    @Override
    public double thanhTien() {
        return this.getSoLuong() * this.getDonGia();
    }

    @Override
    public String toString() {
        return super.toString() +
                "KhachNuocNgoai{" +
                "quocTich='" + quocTich + '\'' +
                "thanh tien " + thanhTien() +
                '}';
    }
}
