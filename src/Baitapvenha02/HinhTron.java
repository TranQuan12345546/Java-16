package Baitapvenha02;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        int banKinh = sc.nextInt();
        System.out.println("Chu vi hình tròn là: " + 2 * banKinh * Math.PI);
        System.out.println("Diện tích hình tròn là: " + Math.pow(banKinh, 2) * Math.PI);
    }
}
