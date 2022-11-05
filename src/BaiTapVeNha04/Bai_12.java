package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        int[][] A = NhapMaTran();
        int[][] B = NhapMaTran();
        int[][] C = Tich2MaTran(A, B);
        XuatMaTran(C);
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

    public static int[][] Tich2MaTran(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr2[0].length];
        if (arr1[0].length != arr2.length) {
            System.out.println("Không thể nhân 2 mảng");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    arr3[i][j] = 0;
                    for (int k = 0; k < arr1[0].length; k++) {
                        arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                    }
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
