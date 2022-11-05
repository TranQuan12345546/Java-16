package Baitapvenha05.Bai4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] myPoints = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập x: ");
            double x = new Scanner(System.in).nextInt();
            System.out.print("Nhập y: ");
            double y = new Scanner(System.in).nextInt();
            myPoints[i] = new MyPoint(x, y);
        }

        double max = distance(MyPoint[0], MyPoint[1]);
        for (int i = 0; i < n; i++) {
            myPoints[i] 
        }

    }

    public static TimKhoangCachMax() {

    }
}
