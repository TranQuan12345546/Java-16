package test;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(){
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public int tinhDienTich() {
        return (chieuDai * chieuRong);
    }

    
}