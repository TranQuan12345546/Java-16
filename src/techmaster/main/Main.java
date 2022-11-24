package techmaster.main;

import techmaster.entity.TechMaster;
import techmaster.entity.Student;
import techmaster.logic.LogicHandle;

import java.util.Scanner;

public class Main {
    public static TechMaster techMaster;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LogicHandle logicHandle = new LogicHandle();
        while (true) {
            logicHandle.showMenu();
            int choose;
            do {
                choose = Integer.parseInt(sc.nextLine());
                if (choose >= 1 && choose <= 6) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            } while (true);

            switch (choose) {
                case 1: techMaster = logicHandle.inputTech();
                    break;
                case 2:
                    logicHandle.showClass();
                    break;
                case 3:
                    logicHandle.addStudent();
                    break;
                case 4:
                    logicHandle.setLevel(sc);
                    break;
                case 5:
                    logicHandle.removeStudent();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }




}
