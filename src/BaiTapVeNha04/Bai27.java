package BaiTapVeNha04;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        int[] a = NhapMang();
        int[] b = NhapMang();
        int[] c = Tong2mang(a, b);
        XuatMang(c);
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

    public static int[] Tong2mang(int[] a, int[] b){
        int[] c = new int[a.length];

        //đảo chiều b
        for (int i = 0, j = b.length - 1; i < j; i++, j--){
            int temp = b[i];
            b[i]  = b[j];
            b[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
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
