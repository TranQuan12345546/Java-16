package BaiTapVeNha03;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.print("Nhập h: ");
        int h = new Scanner(System.in).nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h- i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
