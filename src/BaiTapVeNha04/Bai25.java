package BaiTapVeNha04;

import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        int[] a = NhapMang();
        DemSo(a);
    }

    public static int[] NhapMang() {
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

    public static void DemSo(int[] arr) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                s1++;
            } else {
                s2++;
            }
        }
        System.out.println("Mảng có " + s1 + " số chẵn.");
        System.out.print("Mảng có " + s2 + " số lẻ.");
    }
}
