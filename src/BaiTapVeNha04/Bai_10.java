package BaiTapVeNha04;

import java.util.Scanner;

public class Bai_10 {

    //Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau. Nếu nhập một số đã có
    //thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
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
            if(i==1){
                while (KiemTraTonTai(arr, arr[i])) {
                    System.out.print("Vui lòng nhập lại arr[" + i + "]: ");
                    arr[i] = new Scanner(System.in).nextInt();
                }
            }
        }
        return arr;
    }

    public static boolean KiemTraTonTai(int[] arr, int a){
        boolean b = false;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if(a == arr[i]) {
                b = true;
                break;
            }
        }
        return b;
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
