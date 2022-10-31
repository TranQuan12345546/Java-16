package BaiTapVeNha03;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }

        int S = 0;
        for (int i = 1; i <= n ; i++) {
            S += i;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " là " + S);

        System.out.println("--------------------------");

        int S1 = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 != 0) {
                S1 += i;
            }
        }
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn " + n + " là " + S1);

        System.out.println("--------------------------");

        int S2 = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 0) {
                S2 += i;
            }
        }
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn " + n + " là " + S2);
    }
    
}
