package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("nhập n:");
        int n = new Scanner(System.in).nextInt();
        double s = 0;
        for(int i = 1; i <= n; i++){
            s+=(double) 1/i;
        }
        System.out.println(s);


    }



}
