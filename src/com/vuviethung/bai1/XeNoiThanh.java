package com.vuviethung.bai1;

import java.util.Scanner;

public class XeNoiThanh extends Xe {
    private  String soTuyen;
    private int soKMDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenLaiXe, String soTuyen, double doanhThu, String soTuyen1, int soKMDiDuoc) {
        super(maSoChuyen, hoTenLaiXe, soTuyen, doanhThu);
        this.soTuyen = soTuyen1;
        this.soKMDiDuoc = soKMDiDuoc;
    }

    public XeNoiThanh(String soTuyen, int soKMDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKMDiDuoc = soKMDiDuoc;
    }

    public XeNoiThanh(){
        super();
        this.soTuyen ="";
        this.soKMDiDuoc =0;
    }

    @Override
    public String getSoTuyen() {
        return soTuyen;
    }

    @Override
    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKMDiDuoc() {
        return soKMDiDuoc;
    }

    public void setSoKMDiDuoc(int soKMDiDuoc) {
        this.soKMDiDuoc = soKMDiDuoc;
    }

    @Override
    public void nhapXe() {
        super.nhapXe();
        System.out.println("Nhap so tuyen");
        this.soTuyen = new Scanner(System.in).nextLine();
        System.out.println("Nhap so km di duoc");
        this.soKMDiDuoc = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+
                "XeNoiThanh{" +
                "soTuyen='" + soTuyen + '\'' +
                ", soKMDiDuoc=" + soKMDiDuoc +
                "tinh doanh thu " +tinhDoanhThu()+
                '}';
    }

    @Override
    public double tinhDoanhThu() {
        return this.soKMDiDuoc * this.getDoanhThu();
    }
}
