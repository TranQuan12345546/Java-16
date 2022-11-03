package BaiTapVeNha04;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int[] arr = NhapMang();
        tinhSoLanXuatHien(arr);
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

    public static void tinhSoLanXuatHien(int[] arr) {

        //tạo ra 1 mảng mới và đếm sô lần xuất hiện rồi gán vào mảng;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr1[i]++;
                }

            }
        }

        //tìm số lần xuất hiện nhiều nhất
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
        }

        //đối chiếu với mảng ban đầu và in ra kq
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == max) {
                if (i == 1) {
                    System.out.println("Số " + arr[i] + " có số lần xuất hiện nhiều nhất là: " + max + " lần");
                } else {
                    for (int j = 0; j < i; j++) {
                        if(arr[j] == arr[i]) {
                            dem++;
                        }
                    }
                    if(dem == 0){
                        System.out.println("Số " + arr[i] + " có số lần xuất hiện nhiều nhất là: " + max + " lần");
                    }
                }

            }
        }

    }
}
