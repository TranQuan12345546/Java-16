package Baitapvenha02;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int width = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int height = sc.nextInt();
        System.out.println("Chu vi hình chữ nhật là: " + 2*(width + height));
        System.out.println("Diện tích hình chữ nhật là: " + width * height);
    }
}
