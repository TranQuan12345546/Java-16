package test;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(3,4);
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        int nnext = new Scanner(System.in).nextInt();
    }
}
