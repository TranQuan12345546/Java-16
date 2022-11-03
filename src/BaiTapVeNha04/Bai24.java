package BaiTapVeNha04;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        int[] a = NhapMang();
        SapXep(a);
        XuatMang(a);
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

    public static  int[] SapXep(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    public static void XuatMang(int[] arr) {
        System.out.println("Mảng cần tìm là: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}
