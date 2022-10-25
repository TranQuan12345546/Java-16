package Baitapvenha02;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        String ketQua = a != 0? (-b / (double)a) + "" : b != 0? "PT vô nghiệm" : "PT vô số nghiệm";
        System.out.println(ketQua);
    }
}
