package dangnhap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Email> emails = new ArrayList<>();
    public static ArrayList<Username> usernames = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            int choose = 0;
            do {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose <1 || choose > 2) {
                        System.out.println("Lựa chọn không hợp lệ");
                    }
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số");
                }
            } while (choose < 1 || choose > 2);
            if (choose == 1) {
                Password password = new Password();
                password.input(sc);
            }
        }
    }
}
