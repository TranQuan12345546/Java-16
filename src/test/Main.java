package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
     public static void  main(String[] args) {
         Random rd = new Random();
         ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
         int[] kq = new int[9];
         int n = arrayList.size();
         while (n > 0) {
             kq[n-1] = arrayList.remove(rd.nextInt(n));
             n--;
         }
         for (int i = 0; i < 9; i++) {
             System.out.print(kq[i] + " ");
         };




    }
}
