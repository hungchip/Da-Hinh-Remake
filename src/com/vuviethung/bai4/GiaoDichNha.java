package com.vuviethung.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private int loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, int loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(int loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha() {
        super();
        this.loaiNha = 0;
        this.diaChi = "";
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("Nhap loai nha");
        this.loaiNha = new Scanner(System.in).nextInt();
        System.out.println();
        this.diaChi = new Scanner(System.in).nextLine();
    }

    @Override
    public double thanhTien() {
        if (loaiNha == 0) {
            return this.getDienTich() * this.getDonGia();
        }
        return this.getDienTich() * this.getDonGia() * 0.9;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "loaiNha=" + loaiNha +
                ", diaChi='" + diaChi + '\'' +
                "thanh tien" + thanhTien() +
                '}';
    }
}
