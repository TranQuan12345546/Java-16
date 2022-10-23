package Baitapvenha01.bai5;

public class SinCos {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double sin = a / c;
        double cos = b / c;
        System.out.println("Sin = " + sin);
        System.out.println("Cos = " + cos);
    }
}
