package BaiTapVeNha04;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        int[] a = NhapMang();
        Max(a);
        Min(a);
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

    public static void Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    public static void Min(int[] arr) {
        int min = arr[0];
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] > arr[i-1]){
                min = arr[i-1];
            }
        }
        System.out.print("Số nhỏ nhất trong mảng là: " + min);
    }
}
