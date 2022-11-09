package BaiTapVeNha06.MuonSach.entity;

import BaiTapVeNha06.MuonSach.constant.ReaderType;

import java.util.Scanner;

public class Reader extends Person{

    public static int AUTO_ID = 0;
    private final int id;
    private String type;

    public Reader() {
        if(AUTO_ID == 0) {
            AUTO_ID = 10000;
        }
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Học viên cao học.");
        System.out.println("3. Giảng viên.");
        int readerTypeTemp;
        do {
            readerTypeTemp = new Scanner(System.in).nextInt();
            if (readerTypeTemp >= 1 && readerTypeTemp <= 3) {
                break;
            }
            System.out.print("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (readerTypeTemp) {
            case 1:
                this.type = ReaderType.SINHVIEN;
                break;
            case 2:
                this.type = ReaderType.HOCVIENCAOHOC;
                break;
            case 3:
                this.type = ReaderType.GIANGVIEN;
                break;
        }
    }
}
