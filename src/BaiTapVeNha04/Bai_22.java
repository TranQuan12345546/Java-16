package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_22 {
    public static void main(String[] args) {
        int[][] a = NhapMaTran();
        Max(a);
        Min(a);
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

    public static void Max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong ma trận là: " + max);
    }

    public static void Min(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Số nhỏ nhất trong ma trận là: " + min);
    }
}
