package BaiTapVeNha03;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("Ước chung lớn nhất là: %d", a);
    }
}
