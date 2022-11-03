package BaiTapVeNha04;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        Average(arr);
    }

    public static int[] NhapMang(){
        System.out.print("Mời nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void Average(int[] arr) {
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        while (b < 0) {
            System.out.print("Vui lòng nhập số lớn hơn 0: ");
            b = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhập c: ");
        int c = new Scanner(System.in).nextInt();
        while (c < b) {
            System.out.print("Vui lòng nhập số lớn hơn " + b + ": ");
            c = new Scanner(System.in).nextInt();
        }

        int S = 0;
        int term = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= b && arr[i] <= c){
                S = S + arr[i];
                term++;
            }
        }

        double Avg = (double) S / term;
        System.out.println("Trung bình cộng các số nằm trong khoảng [" + b + "," + c + "] là: " + Avg);
    }
}
