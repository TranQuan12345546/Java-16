package phoigiongthucung;

import java.util.Scanner;

public class View {
    public int sexView(Scanner sc) {
        System.out.println("Chọn giới tính");
        System.out.println("1. Giống đực");
        System.out.println("2. Giống cái");
        System.out.println("Chọn: ");
        int sex = 0;
        do {
            try {
                sex = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần chọn 1 trong 2 phương án.");
            }
            if (sex < 1 || sex > 2) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } while (sex < 1 || sex > 2);
        return sex;
    }

    public int typeView(Scanner sc) {
        System.out.println("Chọn kiểu: ");
        System.out.println("1. DOG");
        System.out.println("2. CAT");
        System.out.println("Chọn: ");
        int type = 0;
        do {
            try {
                type = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần chọn 1 trong 2 phương án.");
            }
            if (type < 1 || type > 2) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } while (type < 1 || type > 2);
        return type;
    }

    public int petView(Scanner sc) {
        System.out.println("Bạn có muốn tìm chú pet khác không?");
        System.out.println("1. Có");
        System.out.println("2. Không");
        System.out.println("Chọn: ");
        int chose = 0;
        do {
            try {
                chose = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần chọn 1 trong 2 phương án.");
            }
            if (chose < 1 || chose > 2) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } while (chose < 1 || chose > 2);
        return chose;
    }


}
