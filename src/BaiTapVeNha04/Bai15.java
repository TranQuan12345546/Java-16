package BaiTapVeNha04;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        System.out.print("Mời nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Mời nhập số tự nhiên n: ");
            n = new Scanner(System.in).nextInt();
        }

        Sum(n);
    }

    public static void Sum(int n) {
        int S = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 7 == 0) {
                S += i;
            }
        }
        System.out.print("Tổng các số tự nhiên không lớn hơn " + n + " và chia hết cho 7 là: " + S);
    }
}
