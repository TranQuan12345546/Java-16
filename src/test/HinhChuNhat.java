package test;

public class HinhChuNhat {
    int chieuDai;
    int chieuRong;

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