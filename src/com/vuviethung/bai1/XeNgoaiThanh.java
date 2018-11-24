package com.vuviethung.bai1;

import java.util.Scanner;

public class XeNgoaiThanh extends Xe {
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String hoTenLaiXe, String soTuyen, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenLaiXe, soTuyen, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDiDuoc =0;
    }

    @Override
    public void nhapXe() {
        super.nhapXe();
        System.out.println("Nhap noi den");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("Nhap so ngay di duoc");
        this.soNgayDiDuoc = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+
                "XeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                "tinh doanh thu" + tinhDoanhThu()+
                '}';
    }

    @Override
    public double tinhDoanhThu() {
        return this.soNgayDiDuoc* this.getDoanhThu();
    }
}
