package Baitapvenha05.Bai2;

import Baitapvenha05.Bai1.SinhVien;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Số lượng sinh viên cần nhập: ");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] sinhViens = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sinhViens[i] = new SinhVien();
            sinhViens[i].NhapThongTin();
        }
        InDanhSachSinhVien(sinhViens);
    }

    public static void InDanhSachSinhVien(SinhVien[] sinhViens) {
        for (int i = 0; i < sinhViens.length; i++) {
            sinhViens[i].Display();
        }
    }
}
