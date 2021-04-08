package com.duong.demoabstractclass;

public  class NhanVienFull extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;
    public NhanVienFull(String ten, int ngayLamThem, int loaiChucVu){
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    protected String loaiNhanVien() {
        return loaiChucVu == Configs.SEP ? "FULLTIMESEP" : "FULLTIMELINH " ;
    }

    @Override
    public void tinhLuong() {
        switch (this.loaiChucVu) {
            case Configs.SEP: {
                this.luong = Configs.LUONGSEP + this.ngayLamThem * Configs.LUONGLAMTHEM;
                break;
            }
            case Configs.LINH : {
                this.luong = Configs.LUONGLINH + this.ngayLamThem*Configs.LUONGLAMTHEM;
                break;
            }
        }
    }
}
