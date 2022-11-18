package quanlycuahang;

import java.util.Scanner;

public class Product implements Inputable {

    public static int PRODUCT_ID = 100;
    private final int id;
    private String name;
    private String disc;
    private int number;
    private int price;
    private String unit;

    public Product() {
        this.id = PRODUCT_ID;
        PRODUCT_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", disc='" + disc + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }

    @Override
    public void InputInfo() {
        System.out.println("Nhập tên sản phẩm: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập mô tả: ");
        this.disc = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        this.number = new Scanner(System.in).nextInt();
        System.out.println("Nhập giá bán: ");
        this.price = new Scanner(System.in).nextInt();
        System.out.println("Nhập đơn vị tính: ");
        this.unit = new Scanner(System.in).nextLine();
    }
}
