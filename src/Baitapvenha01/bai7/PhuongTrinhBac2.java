package Baitapvenha01.bai7;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        double a = 5;
        int b = -4;
        int c = -6;
        double delTa = Math.pow(b, 2) - 4* a * c;
        double x1 = (-b + Math.sqrt(delTa)) / 8;
        double x2 = (-b - Math.sqrt(delTa)) / 8;
        System.out.println("Hai nghiệm của phương trình là: ");
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }
}