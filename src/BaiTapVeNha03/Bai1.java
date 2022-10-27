package BaiTapVeNha03;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhập d: ");
        int d = new Scanner(System.in).nextInt();

        int max1 = a;
        int max2 = c;
        if (a < b){
            max1 = b;
        }
        if (c < d){
            max2 = d;
        }
        if (max1 < max2) {
            System.out.println("Số lớn nhất trong 4 số là: " + max2);
        } else {
            System.out.println("Số lớn nhất trong 4 số là: " + max1);
        }
    }
}
