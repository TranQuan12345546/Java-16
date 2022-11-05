package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_28 {
    public static void main(String[] args) {
        int[][] a = NhapMaTran();
        TongDuongCheoChinh(a);
    }

    public static int[][] NhapMaTran(){
        System.out.print("Mời nhập n: ");
        int n = new Scanner(System.in).nextInt();
        while (n <= 0) {
            System.out.println("Nhập số tự nhiên: ");
            n = new Scanner(System.in).nextInt();
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập arr[" + i + "][" + j + "]: ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static void TongDuongCheoChinh(int[][] arr) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    S+= arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " + S);
    }
}
