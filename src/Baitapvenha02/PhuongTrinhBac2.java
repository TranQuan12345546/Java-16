package Baitapvenha02;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        double delTa = Math.pow(b, 2) - 4* a * c;
        String ketQua = delTa < 0? "PT vô nghiệm" : delTa == 0? (-b / 2*(double)a) + " ":
                "Hai nghiệm của phương trình là: \nx1 = " + ((-b + Math.sqrt(delTa)) /( 2*a)) + "\n" + "x2 = " + ((-b - Math.sqrt(delTa)) / (2*a));
        System.out.println(ketQua);
    }
}
