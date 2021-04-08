package com.duong.demoabstractclass;

public class Test {
    public static void main(String[] args) {
        NhanVienFull nhanVienFull = new NhanVienFull("Khanh", 10, Configs.SEP );
        NhanVienPartTime nhanVienPartTime = new NhanVienPartTime("Han", 200);
        NhanVienFull nhanVienFull1 = new NhanVienFull("Huy", 10,Configs.LINH);

//        nhanVienPartTime.tinhLuong();
//        nhanVienFull.tinhLuong();
//        nhanVienFull1.tinhLuong();

        nhanVienFull.xuatThongTin();
        nhanVienFull1.xuatThongTin();
        nhanVienPartTime.xuatThongTin();

    }
}
