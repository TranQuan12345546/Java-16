package BaiTapVeNha03;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.print("Nhập h: ");
        int h = new Scanner(System.in).nextInt();

        int m = 2*h-1;
        int n = h%2 + h/2;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= m; j++) {
                if(i == h && j == m) {
                    System.out.print("*");
                } else if (i == 1 && j != h && j != m) {
                    System.out.print("  ");
                } else if (i == 1 && j == m){
                    System.out.println(" ");
                } else if (i != 1 && i != h && j == m){
                    System.out.println(" ");
                } else if (i != h && j == 1) {
                    System.out.print("  ");
                } else if (i != 1 && i != h && i < n & )
                else {
                    System.out.print("* ");
                }
            }
        }
    }
}
