package BaiTapVeNha07.entity;

import java.util.Scanner;

public class Person {

    protected String name;
    protected String address;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void ImportDriver() {
        System.out.println("Nhập tên lái xe: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ của lái xe: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập SĐT lái xe: ");
        this.phone = new Scanner(System.in).nextLine();
    }
}
