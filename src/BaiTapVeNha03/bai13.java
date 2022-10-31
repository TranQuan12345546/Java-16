package BaiTapVeNha03;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Vui lòng nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }

        int S = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 7 == 0){
                S+=i;
            }
        }
        System.out.printf("Tổng các số tự nhiên không lớn hơn %d và chia hết cho 7 là: %d", n,S);
    }
}
