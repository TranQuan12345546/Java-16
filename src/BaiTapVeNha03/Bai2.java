package BaiTapVeNha03;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Vui lòng nhập số lớn hơn 0: ");
            n = new Scanner(System.in).nextInt();
        }

        int s = 0;
        System.out.print("Các ước số của " + n + " là: " );
        for(int i = 1; i <= n; i++){
            if(n == i) {
                System.out.print(n);
                break;
            }
            if(n%i==0){
                System.out.print(i + ", ");
                s++;
            }
        }
        System.out.println("\nSố ước của " + n + " là: " + s);
    }
}
