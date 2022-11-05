package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_21 {
    public static void main(String[] args) {
        int[][] a = NhapMaTran();
        int S = TongMaTran(a);
        System.out.println("Tổng tất cả các phần tử trong ma trận là: " + S);
        TrungBinhCong(a,S);
    }

    public static int[][] NhapMaTran(){
        System.out.print("Mời nhập số dòng: ");
        int m = new Scanner(System.in).nextInt();
        while (m <= 0) {
            System.out.println("Nhập số tự nhiên: ");
            m = new Scanner(System.in).nextInt();
        }
        System.out.print("Mời nhập số cột: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.println("Nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập arr[" + i + "][" + j + "]: ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static int TongMaTran(int[][] arr) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                S += arr[i][j];
            }
        }
        return S;
    }

    public static void TrungBinhCong(int[][] arr, int S) {
        double avg = (double) S / (arr.length * arr[0].length);
        System.out.println("Trung bình cộng các phần tử trong mảng là: " + avg);
    }
}
