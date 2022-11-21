package techmaster;

import java.util.Scanner;

public class Person {
    public static int STUDENT_ID = 100;

    protected final int id;
    protected String name;
    protected int age;

    public Person() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void inputInfo() {
        System.out.println("Mời nhập tên: ");
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
}
