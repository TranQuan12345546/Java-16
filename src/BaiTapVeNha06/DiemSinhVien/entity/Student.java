package BaiTapVeNha06.DiemSinhVien.entity;

import BaiTapVeNha06.MuonSach.constant.ReaderType;

import java.util.Scanner;

public class Student extends Person{

    public static int AUTO_ID_STUDENT = 10000;
    private final int id;
    private String spec;

    public Student() {
        this.id = AUTO_ID_STUDENT;
        AUTO_ID_STUDENT++;
    }

    public int getId() {
        return id;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", spec='" + spec + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập lớp:");
        spec = new Scanner(System.in).nextLine();
    }
}
