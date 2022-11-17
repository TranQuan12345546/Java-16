package Lab1;

import java.util.Scanner;

public class Member {
    public static int MEMBER_ID = 1000;
    private final int id;
    private String name;
    private String dob;
    private String job;

    public Member() {
        this.id = MEMBER_ID;
        MEMBER_ID++;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void Input() {
        System.out.print("Nhập tên người dùng: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập ngày - tháng - năm sinh: ");
        this.dob = new Scanner(System.in).nextLine();
        System.out.print("Nhập việc làm: ");
        this.job = new Scanner(System.in).nextLine();

    }
}
