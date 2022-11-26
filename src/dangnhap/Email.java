package dangnhap;

import java.util.Scanner;

public class Email extends Username implements Input{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input(Scanner sc) {

    }
}
