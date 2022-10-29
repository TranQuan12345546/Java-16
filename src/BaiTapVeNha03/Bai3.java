package BaiTapVeNha03;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        int x = a;
        int y = b;
        while (x != y) {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }
        System.out.printf("Ước chung lớn nhất là: %d \n", x);
        System.out.println("Bội chung nhỏ nhất là: " + ((a*b)/x));
    }
}
