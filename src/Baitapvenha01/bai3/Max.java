package Baitapvenha01.bai3;

public class Max {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 6;
        byte c = 10;
        byte d = 12;
        System.out.println("Số lớn nhất là: " + Math.max(a, Math.max(b,Math.max(c, d))));
    }
}
