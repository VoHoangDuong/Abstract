package com.duong.demoabstractclass;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec){
        super(ten);
        this.gioLamViec = gioLamViec;
    }


    @Override
    protected String loaiNhanVien() {
        return "nhan vien parttime";
    }

    @Override
    public void tinhLuong() {
        this.luong = this.gioLamViec*Configs.LUONGGIO;
    }
}
