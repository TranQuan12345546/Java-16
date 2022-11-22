package lab1a;

import java.util.Scanner;

public class Student {
    private static int STUDENT_ID = 100;

    private final int id;
    private String name;
    private String address;
    private int age;

    public Student() {
        this.id = STUDENT_ID;
        STUDENT_ID++;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên người dùng: ");
        this.name = sc.nextLine();
        System.out.println("Mời nhập địa chỉ: ");
        this.address = sc.nextLine();
        do {
            try {
                System.out.println("Mời nhập tuổi: ");
                this.age = Integer.parseInt(sc.nextLine());
                if (age <= 0) {
                    System.out.println("Bạn cần nhập tuổi lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Tuổi phải là 1 số tự nhiên");
            }
        } while (age <= 0);
    }

}
