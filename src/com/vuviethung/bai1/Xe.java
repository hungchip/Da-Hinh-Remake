package com.vuviethung.bai1;

import java.util.Scanner;

public abstract class Xe {
    private String maSoChuyen;
    private String hoTenLaiXe;
    private String soTuyen;
    private double doanhThu;

    public Xe(String maSoChuyen, String hoTenLaiXe, String soTuyen, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenLaiXe = hoTenLaiXe;
        this.soTuyen = soTuyen;
        this.doanhThu = doanhThu;
    }

    public Xe() {
        this.maSoChuyen = "";
        this.hoTenLaiXe = "";
        this.soTuyen = "";
        this.doanhThu = 0;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenLaiXe() {
        return hoTenLaiXe;
    }

    public void setHoTenLaiXe(String hoTenLaiXe) {
        this.hoTenLaiXe = hoTenLaiXe;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhapXe(){
        System.out.println("Nhap ma so chuyen");
        this.maSoChuyen = new Scanner(System.in).nextLine();
        System.out.println("nhap ho ten lai xe");
        this.hoTenLaiXe = new Scanner(System.in).nextLine();
        System.out.println("Nhap so tuyen");
        this.soTuyen = new Scanner(System.in).nextLine();
        System.out.println("Nhap doanh thu");
        this.doanhThu = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "Xe{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenLaiXe='" + hoTenLaiXe + '\'' +
                ", soTuyen='" + soTuyen + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public abstract double tinhDoanhThu();
}
