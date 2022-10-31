package BaiTapVeNha03;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();
        while (a < 0) {
           a = Math.abs(a);
        }

        int term = a;
        int ketQua = 0;
        while (term > 0) {
            int b = term % 10;
            ketQua += b;
            term = term / 10;
        }
        System.out.println("Tổng các chữ số của số nguyên " + a + " là: " + ketQua);

    }
}
