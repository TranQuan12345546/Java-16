package BaiTapVeNha04;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        SoLonThuHai(arr);
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

    public static void SoLonThuHai(int[] arr) {
        int[] arr1 = new int[arr.length];

        // Copy array
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int a = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = a;
                }
            }
        }

        int kQ = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr1[arr1.length - 2] == arr[i]) {
                kQ++;
            }
        }

        if(kQ == arr.length) {
            System.out.println("Không có số lớn thứ 2");
        } else {
            System.out.println("Vị trí của số lớn thứ 2 trong dãy là: ");
            for (int i = 0; i < arr.length; i++) {
                if(arr1[arr1.length - 2] == arr[i]) {
                    System.out.print((i+1) + " ");
                }
            }
        }
    }
}
