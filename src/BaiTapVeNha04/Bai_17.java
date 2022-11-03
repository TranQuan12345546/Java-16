package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_17 {
    public static void main(String[] args) {
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        while (m < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            m = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }

        KiemTraSoNguyenTo(m,n);
    }

    public static void KiemTraSoNguyenTo(int m, int n) {
        int x = m;
        int y = n;
        while (x != y) {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }

        if (y == 1) {
            System.out.println(m + " và " + n + " là 2 số nguyên tố cùng nhau");
        } else {
            System.out.println(m + " và " + n + " không phải là 2 số nguyên tố cùng nhau");
        }
    }
}
