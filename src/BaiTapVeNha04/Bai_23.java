package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_23 {
    public static void main(String[] args) {
        int[][] a = NhapMaTran();
        int[][] b = NhapMaTran();
        int[][] c = Tong2matran(a, b);
        XuatMaTran(c);
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

    public static int[][] Tong2matran(int[][] arr1, int[][] arr2){
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            System.out.println("Không thể cộng 2 ma trận này");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        return arr3;
    }

    public static void XuatMaTran(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(j == arr[0].length - 1 && i == arr.length-1){
                    System.out.print(arr[i][j]);
                    break;
                }
                if (j == arr[0].length - 1 && i != arr.length-1){
                    System.out.println(arr[i][j]);
                    break;
                }
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("]");
    }
}
