package techmaster.main;

import techmaster.entity.ClassTech;
import techmaster.entity.TechMaster;
import techmaster.entity.Lecture;
import techmaster.entity.Manager;
import techmaster.entity.Student;
import techmaster.logic.LogicHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static TechMaster techMaster;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            LogicHandle.showMenu();
            int choose;
            do {
                choose = Integer.parseInt(sc.nextLine());
                if (choose >= 1 && choose <= 6) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            } while (true);

            switch (choose) {
                case 1: techMaster = inputTech();
                    break;
                case 2:
                    System.out.println(techMaster);
                    break;
                case 3:
                    Student student = addStudent();
                    techMaster.getClassTech().getStudents().add(student);
                    break;
                case 4:
                    setLevel();
                    break;
                case 5:
                    LogicHandle.removeStudent();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }





    private static void setLevel() {
        System.out.println("Nhập học lực mới: ");
        String setLevel = new Scanner(System.in).nextLine();
        ArrayList<Student> student = techMaster.getClassTech().getStudents();
        int num = 0;
        boolean flag = true;
        do {
            do {
                try {
                    System.out.println("Nhập mã học viên cần sửa thông tin: ");
                    num = Integer.parseInt(sc.nextLine());
                    if (num < 100) {
                        System.out.println("Không tồn tại mã học viên này");
                    }
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số tự nhiên");
                }
            } while (num < 100);

            for (Student i : student) {
                if (num == i.getId()) {
                    i.setLevel(setLevel);
                    flag = false;
                    break;
                }
                System.out.println("Không có học viên nào mang mã " + num);
            }
        } while (flag);

    }

    private static Student addStudent() {
        Student student = new Student();
        student.inputInfo();
        return student;
    }

    private static TechMaster inputTech() {
        Manager manager = new Manager();
        manager.inputInfo();
        Lecture lecture = new Lecture();
        lecture.inputInfo();
        ClassTech classTech = new ClassTech();
        classTech.inputClass();
        techMaster = new TechMaster(manager, lecture, classTech);
        return techMaster;
    }
}
