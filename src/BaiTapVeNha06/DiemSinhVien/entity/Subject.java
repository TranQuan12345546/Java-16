package BaiTapVeNha06.DiemSinhVien.entity;

import BaiTapVeNha06.DiemSinhVien.constant.TypeSub;
import BaiTapVeNha06.MuonSach.constant.CategoriesType;

import java.util.Scanner;

public class Subject {

    public static int AUTO_ID_SUBJECT = 10000;
    private final int id;
    private String name;
    private int num;
    private String typeSub;

    public Subject() {
        this.id = AUTO_ID_SUBJECT;
        AUTO_ID_SUBJECT++;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTypeSub() {
        return typeSub;
    }

    public void setTypeSub(String typeSub) {
        this.typeSub = typeSub;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", typeSub='" + typeSub + '\'' +
                '}';
    }


    public void nhapMonHoc() {
        System.out.println("Mời nhập tên môn học: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Mời nhập số đơn vị học trình: ");
        num = new Scanner(System.in).nextInt();
        ChonMonHoc();
    }

    private void ChonMonHoc() {
        System.out.println("Chọn 1 trong các môn sau: ");
        System.out.println("1. Đại cương");
        System.out.println("2. Cơ sở ngành");
        System.out.println("3. Chuyên ngành");
        int numCategories;
        do {
            numCategories = new Scanner(System.in).nextInt();
            if (numCategories >= 1 && numCategories <= 3) {
                break;
            }
            System.out.println("Không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (numCategories) {
            case 1 -> this.typeSub = TypeSub.DAICUONG;
            case 2 -> this.typeSub = TypeSub.COSONGANH;
            case 3 -> this.typeSub = TypeSub.CHUYENNGANH;
        }
    }
}
