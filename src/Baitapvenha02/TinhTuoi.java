package Baitapvenha02;

import java.time.LocalDate;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày sinh: ");
        int ngaySinh = sc.nextInt();
        System.out.print("Nhập tháng sinh: ");
        int thangSinh = sc.nextInt();
        System.out.print("Nhập năm sinh: ");
        int namSinh = sc.nextInt();
        LocalDate Date = LocalDate.now();
        LocalDate tuoi = LocalDate.of(namSinh, thangSinh, ngaySinh);
        int ketQua = Date.getYear() - tuoi.getYear();
        System.out.println("Tuổi của bạn là: " + ketQua);
    }

}
