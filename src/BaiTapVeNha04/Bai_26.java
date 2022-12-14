package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_26 {
    public static void main(String[] args) {
        System.out.print("Mời nhập số nguyên x: ");
        int x = new Scanner(System.in).nextInt();
        int[] a = NhapMang();
        SoLanXuatHien(a, x);
    }

    public static int[] NhapMang(){
        System.out.print("Mời nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        while (n < 0) {
            System.out.print("Mời nhập vào số dương: ");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void SoLanXuatHien(int[] arr, int x) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                s++;
            }
        }
        System.out.println("Số lần xuất hiện của " + x + " trong mảng là: " + s);
    }
}
