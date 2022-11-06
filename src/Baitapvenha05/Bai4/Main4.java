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

        double max = 0;
        int h = 0, k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(myPoints[i].distance(myPoints[j]) > max){
                    max = myPoints[i].distance(myPoints[j]);
                    h = i;
                    k = j;
                }
            }
        }
        System.out.println("Khoảng cách lớn nhất giữa 2 điểm là: " + max);
        System.out.println("Toạ độ 2 điểm tìm được là: " + myPoints[h].toString() + " và " + myPoints[k].toString());


    }

}
