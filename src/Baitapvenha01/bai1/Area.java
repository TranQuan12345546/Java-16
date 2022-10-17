package Baitapvenha01.bai1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int height = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        int width = sc.nextInt();
        System.out.println("Dien tich hinh chu nhat la: " + height*width);
    }
}
