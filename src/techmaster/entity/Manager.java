package techmaster.entity;

import java.util.Scanner;

public class Manager extends Person{

    public void inputInfo() {
        System.out.println("Mời nhập tên quản lý: ");
        this.name = new Scanner(System.in).nextLine();
        do {
            try {
                System.out.println("Mời nhập tuổi: ");
                this.age = Integer.parseInt(new Scanner(System.in).nextLine());
                if (age <= 0) {
                    System.out.println("Hãy nhập số tuổi lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số tự nhiên");
            }
        } while (age <= 0);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
