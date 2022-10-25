package Baitapvenha02;

import java.io.IOException;
import java.util.Scanner;

public class bai5a {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi của bạn: ");
        String a = sc.next();
        System.out.print("Nhập vào 1 kí tự bất kì: ");
        String b = sc.next();
        System.out.println("Vị trí xuất hiện đầu tiên của kí tự "+ b + " là " + a.indexOf(b));
        System.out.println("Vị trí xuất hiện cuối cùng của kí tự "+ b + " là " + a.lastIndexOf(b));
    }

}
