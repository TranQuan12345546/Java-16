package BaiTapVeNha04;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        System.out.println("Mời nhập x: ");
        int x = new Scanner(System.in).nextInt();
        int[] a = NhapMang();
        SapXep(a);
        int[] a1 = ChenX(a,x);
        XuatMang(a1);
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
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    public static int[] ChenX(int[] arr, int x) {
        int term = 0;
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x && x < arr[i+1] || arr[i] < x && x <= arr[i+1]) {
                term = i;
            }
        }
        for (int i = 0; i <= term; i++) {
            arr1[i] = arr[i];
        }
        arr1[term+1] = x;
        for (int i = term + 2; i < arr1.length; i++, term++) {
            arr1[i] = arr[term + 1];
        }
        return arr1;
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
