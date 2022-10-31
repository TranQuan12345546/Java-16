package BaiTapVeNha03;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập số a: ");
        int a = new Scanner(System.in).nextInt();

        int term = a;
        int d = 0;
        while (term > 0) {

            d = (d * 10) + term%10;
            term = term/10;
        }
        if (a == d) {
            System.out.println(a + " là số thuận nghịch");
        } else {
            System.out.println(a + " không là số thuận nghịch");
        }
    }
}
