package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_14 {
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }

        TinhTong(n);
    }

    public static void TinhTong(int n) {
        double S = 0;
        for (int i = 1; i <= n ; i++) {
            S += (double)1/i;
        }
        System.out.println(S);
    }


}
