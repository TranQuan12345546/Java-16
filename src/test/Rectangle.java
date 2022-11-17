package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,6,7));
        list.removeAll(list1);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
