package BaiTapVeNha04;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int [] arr;
        arr = NhapMang();
        DemMang(arr);
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

    public static void DemMang(int[] arr) {
        int S = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){
                S = S + 1;
            }
        }
        System.out.println("Số cặp phần tử liên tiếp nhau là: " + S);
    }
}
