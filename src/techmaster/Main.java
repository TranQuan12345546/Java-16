package techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static TechMaster techMaster;
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choose = new Scanner(System.in).nextInt();
            do {
                if (choose >=1 && choose <= 6) {
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
                    removeStudent();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    private static void showMenu() {
        System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ TECH-MASTER--------");
        System.out.println("1. Nhập thông tin trung tâm");
        System.out.println("2. Hiển thị thông tin trung tâm");
        System.out.println("3. Thêm học viên");
        System.out.println("4. Cập nhật thông tin học lực của học viên");
        System.out.println("5. Xoá học viên khỏi lớp học");
        System.out.println("6. Thoát chương trình");
    }

    private static void removeStudent() {
        ArrayList<Student> student = techMaster.getClassTech().getStudents();
        int num = 0;
        boolean flag = true;
        do {
            do {
                try {
                    System.out.println("Nhập mã học viên cần xoá: ");
                    num = Integer.parseInt(new Scanner(System.in).nextLine());
                    if (num < 100) {
                        System.out.println("Không tồn tại mã học viên này");
                    }
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số tự nhiên");
                }
            } while (num < 100);

            for (Student i : student) {
                if (num == i.getId()) {
                    student.remove(i);
                    flag = false;
                    break;
                }
                System.out.println("Không có học viên nào mang mã " + num);
            }
        } while (flag);

        System.out.println("Danh sách học viên hiện tại của lớp là: ");
        for (Student i : student) {
            System.out.println(i);
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
                    num = Integer.parseInt(new Scanner(System.in).nextLine());
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
        TechMaster techMaster = new TechMaster(manager, lecture, classTech);
        return techMaster;
    }
}
