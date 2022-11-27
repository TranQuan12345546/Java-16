package dangnhap;

import java.util.Scanner;

import static dangnhap.Main.accounts;
import static dangnhap.Main.view;

public class LogInLogic {
    public void logIn(Scanner sc) {
        Account account = userLogIn(sc);
        passwordLogIn(sc, account);
    }

    public Account userLogIn(Scanner sc) {
        System.out.println("Nhập username: ");
        String user;
        Account account = null;
        int count = 0;
        do {
            user = sc.nextLine();
            for (Account i : accounts) {
                if (user.equals(i.getUsername())) {
                    account = i;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Kiểm tra lại username.");
            }
        } while (count == 0);
        return account;
    }

    public void passwordLogIn(Scanner sc, Account account) {
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        if (password.equals(account.getPassword())) {
            System.out.println("Chào mừng " + account.getUsername() + ", bạn có thể thực hiện các công việc sau:");
            LogicHandle logicHandle = new LogicHandle();
            while (true) {
                view.LoginView();
                logicHandle.menuLogin(sc, account);
            }
        } else {
            System.out.println("Password không đúng");
            System.out.println("1. Đăng nhập lại");
            System.out.println("2. Quên mật khẩu");
            int choice = LogicHandle.checkNumberException(sc, 1, 2);
            if (choice == 2) {
                checkEmailForgetMode(sc, account);
            }
        }

    }

    private void checkEmailForgetMode(Scanner sc, Account account) {
        boolean flag = true ;
        do {
            System.out.println("Nhập lại email đăng ký của bạn: ");
            String email = sc.nextLine();
            if (email.equals(account.getEmail())) {
                LogicHandle logicHandle = new LogicHandle();
                logicHandle.changePassword(sc,account);
                flag = false;
            }
            if (flag) {
                System.out.println("Email vừa nhập không khớp với email đăng ký");
            }
        } while (flag);
    }


}
