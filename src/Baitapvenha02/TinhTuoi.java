package Baitapvenha02;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String b = tuoi.format(a);
        System.out.println("Ngày tháng năm sinh của bạn là: " + b);
        int ketQua = Date.getYear() - tuoi.getYear();
        System.out.println("Tuổi của bạn là: " + ketQua);
    }

}
