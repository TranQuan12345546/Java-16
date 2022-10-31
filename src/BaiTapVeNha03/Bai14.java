package BaiTapVeNha03;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.print("Mời nhập số lớn hơn 0: ");
            n = new Scanner(System.in).nextInt();
        }

        System.out.print("Các số chẵn nhỏ hơn " + n + " là ");
        for (int i = 2; i < n; i+=2) {
            System.out.print(i + ", ");
        }
        System.out.print("Các số lẻ nhỏ hơn " + n + " là ");
        for (int i = 1; i < n; i+=2) {
            System.out.print(i + ", ");
        }
    }
}
