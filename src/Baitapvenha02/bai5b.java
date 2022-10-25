package Baitapvenha02;

import java.util.Scanner;

public class bai5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xâu s: ");
        String s = sc.nextLine();
        System.out.print("Nhập xâu s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập xâu s2: ");
        String s2 = sc.nextLine();
        String s3 = s.replace(s1, s2);

        System.out.println(s3);
    }
}
