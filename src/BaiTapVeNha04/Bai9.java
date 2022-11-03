package BaiTapVeNha04;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        SoKhacNhau(arr);
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

    public static void SoKhacNhau(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        System.out.println("Các số khác nhau trong mảng là: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 2; i >= 0 ; i--) {
            if(arr[arr.length - 1] == arr[i]) {
                return;
            }
        }
        System.out.println(arr[arr.length - 1]);


//        for (int i = 0; i < arr1.length; i++) {
//            if (i == arr1.length - 1){
//                System.out.print(arr1[i]);
//                break;
//            }
//            System.out.print(arr1[i] + " ");
//        }
    }
}
