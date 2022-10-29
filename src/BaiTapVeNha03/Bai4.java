package BaiTapVeNha03;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();

        while (n < 2) {
            System.out.print("Mời nhập số lớn hơn 1: ");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println(n + " số nguyên tố đầu tiên là: ");

        int num = 3;
        int status = 0;
        for ( int i = 2 ; i <=n ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 ) {
                    status = 1;
                    break;
                }
            }
            if ( status != 1 ) {
                System.out.print(num + " ");
                i++;
            }
            status = 0;
            num++;
        }
    }
}
