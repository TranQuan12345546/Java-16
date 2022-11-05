package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        int[][] arr = NhapMaTran();
        XuatMaTran(arr);
        int[][] arr1 = MaTranChuyenVi(arr);
        XuatMaTran(arr1);
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

    public static int[][] MaTranChuyenVi(int[][] arr) {
        int[][] arr1 = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        return arr1;
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
