package BaiTapVeNha03;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                System.out.print(i + " ");
                s++;
            }
        }
        System.out.println("\nSố ước của " + n + " là: " + s);
    }
}
