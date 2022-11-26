package dangnhap;

import java.util.Scanner;

public class Password extends Username implements Input{
    private String password;

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Mật khẩu: ");
        this.password = sc.nextLine();
    }

}
