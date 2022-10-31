package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        } while (height <= 0);

        int i;
        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }

    }
}