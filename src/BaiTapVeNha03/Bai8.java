package BaiTapVeNha03;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();

        while (n < 0 || m < 0) {
            n = Math.abs(n);
            m = Math.abs(m);
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == m && j == n) {
                    System.out.print("*");
                } else if (i != m && j == n){
                    System.out.println("*");
                } else if (i != 1 && i != m && j != 1 && j != n){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
