package BaiTapVeNha04;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.print("Mời nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Mời nhập số tự nhiên n: ");
            n = new Scanner(System.in).nextInt();
        }

        SoChanLe(n);
    }

    public static void SoChanLe(int n) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i < n; i++) {
            if(i % 2 != 0) {
                s1 += i;
            } else {
                s2 += i;
            }
        }
        System.out.println("Tổng các số chẵn nhỏ hơn " + n + " là: " + s2);
        System.out.println("Tổng các số lẻ nhỏ hơn " + n + " là: " + s1);

    }
}
