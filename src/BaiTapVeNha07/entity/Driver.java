package BaiTapVeNha07.entity;

import BaiTapVeNha07.constant.levelCons;

import java.util.Scanner;

public class Driver extends Person{

    public static int DRIVERID = 10000;

    private final int driverID;
    private String level;

    public Driver() {
        this.driverID = DRIVERID;
        DRIVERID++;
    }

    public int getDriverID() {
        return driverID;
    }

    public String getLevel() {
        return level;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void ImportDriver() {
        super.ImportDriver();
        System.out.println("Chọn trình độ lái xe:");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        int numCategories;
        do {
            numCategories = new Scanner(System.in).nextInt();
            if (numCategories >= 1 && numCategories <= 6) {
                break;
            }
            System.out.println("Không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (numCategories) {
//            case 1 -> this.level = levelCons.A.value;
//            case 2 -> this.level = levelCons.B.value;
//            case 3 -> this.level = levelCons.C.value;
//            case 4 -> this.level = levelCons.D.value;
//            case 5 -> this.level = levelCons.E.value;
//            case 6 -> this.level = levelCons.F.value;
        }
    }
}
