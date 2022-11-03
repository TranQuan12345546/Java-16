package BaiTapVeNha04;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        KiemTraDoiXung(arr);

    }

    public static int[] NhapMang(){
        System.out.print("Mời nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            arr[i] = new Scanner(System.in).nextInt();
            while (arr[i] < 0) {
                System.out.println("Hãy nhập số nguyên dương!");
                System.out.print("Nhập arr[" + i + "]: ");
                arr[i] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }
    public static void KiemTraDoiXung(int[] arr) {
        int[] arr1 = new int[arr.length];

        //copy mảng
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        //đảo ngược mảng
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--){
            int temp = arr1[i];
            arr1[i]  = arr1[j];
            arr1[j] = temp;
        }

        //kiểm tra đối xứng
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == arr[i]) {
               if (i == arr.length - 1){
                   System.out.println("a là mảng đối xứng");
               }
            } else {
                System.out.println(("a không phải là mảng đối xứng"));
                break;
            }
        }
    }

}
