package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        XuatMang(arr);
    }

    public static int[] NhapMang(){
        System.out.print("Mời nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            arr[i] = new Scanner(System.in).nextInt();
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print("Vui lòng nhập lại arr[" + i + "]: ");
                    arr[i] = new Scanner(System.in).nextInt();
                }
            }
        }
        return arr;
    }

    public static void XuatMang(int[] arr) {
        System.out.print("Mảng vừa nhập là: ");
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
