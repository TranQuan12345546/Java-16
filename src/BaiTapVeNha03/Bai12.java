package BaiTapVeNha03;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        while (m < 0) {
            System.out.print("Vui lòng nhập m là số tự nhiên: ");
            m = new Scanner(System.in).nextInt();
        }

        while ( m > n) {
            System.out.print("Mời nhập n lớn hơn m:");
            n = new Scanner(System.in).nextInt();
        }

        int S = 0;
        for (int i = m; i <= n ; i++) {
            double a = Math.sqrt(i);
            if (a-Math.floor(a)==0) {
                S++;
            }
        }
        System.out.printf("Số chính phương có trong khoảng [%d,%d] là %d", m,n,S );
    }
}
