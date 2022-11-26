package dangnhap;

import java.util.Scanner;

import static dangnhap.Main.emails;

public class Username implements Input{
    public static int USER_ID;

    private final int id;
    private String username;

    public Username() {
        this.id = USER_ID;
        USER_ID++;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public void input(Scanner sc) {
        System.out.println("Nhập email: ");
        Email email = new Email();
        email.setEmail(sc.nextLine());
        emails.add(email);
        System.out.println("Tên đăng nhập: ");
        this.username = sc.nextLine();
    }
}
