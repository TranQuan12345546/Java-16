package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("nhập n:");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }

        System.out.println((double)S / arr.length);
    }
}