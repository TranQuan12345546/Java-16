package BaiTapVeNha03;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        while (a < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            a = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        while (b < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            b = new Scanner(System.in).nextInt();
        }

        int x = a;
        int y = b;
        while (x != y) {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }

        if (x == 1) {
            System.out.println(a + " và " + b + " là 2 số nguyên tố cùng nhau");
        } else {
            System.out.println(a + " và " + b + " không phải là 2 số nguyên tố cùng nhau");
        }
    }
}
