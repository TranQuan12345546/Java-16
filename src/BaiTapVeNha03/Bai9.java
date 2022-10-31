package BaiTapVeNha03;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.print("Nhập h: ");
        int h = new Scanner(System.in).nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if(i == h && j == h) {
                    System.out.print("*");
                } else if (i == 1 && j != h && j != 1) {
                    System.out.print("  ");
                } else if (i != 1 && i != h && j > i && j != h) {
                    System.out.print("  ");
                } else if (i != h && j == h){
                    System.out.println(" ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
