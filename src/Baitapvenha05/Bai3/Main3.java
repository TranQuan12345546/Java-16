package Baitapvenha05.Bai3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("Nhập màu sắc: ");
        String color = new Scanner(System.in).nextLine();
        Rectangle rectangle = new Rectangle(width,height,color);
        System.out.println("Chiều dài: " + width);
        System.out.println("Chiều rộng: " + height);
        System.out.println("Màu sắc: " + color);
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.findArea());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.findPerimeter());;
    }
}
