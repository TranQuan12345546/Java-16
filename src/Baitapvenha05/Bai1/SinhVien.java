package Baitapvenha05.Bai1;

import java.util.Scanner;

public class SinhVien {
    private static int maSinhVien;
    private String name;
    private String lop;
    private String khoa;

    public SinhVien() {

    }

    public void SinhVien(int maSinhVien, String name, String lop, String khoa) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.lop = lop;
        this.khoa = khoa;
    }

    public void NhapThongTin() {
        System.out.print("Nhập mã sinh viên: ");
        this.maSinhVien = new Scanner(System.in).nextInt();
        System.out.print("Nhập tên sinh viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập lớp: ");
        this.lop = new Scanner(System.in).nextLine();
        System.out.print("Nhập khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
    }

    public void Display() {
        System.out.println(this.maSinhVien + " - " + this.name + " - " + this.lop + " - " + this.khoa);
    }


}
