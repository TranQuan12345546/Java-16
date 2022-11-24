package techmaster.logic;

import techmaster.entity.*;
import techmaster.main.Main;

import java.util.ArrayList;
import java.util.Scanner;

import static techmaster.main.Main.techMaster;

public class LogicHandle {
    public void showMenu() {
        System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ TECH-MASTER--------");
        System.out.println("1. Nhập thông tin trung tâm");
        System.out.println("2. Hiển thị thông tin trung tâm");
        System.out.println("3. Thêm học viên");
        System.out.println("4. Cập nhật thông tin học lực của học viên");
        System.out.println("5. Xoá học viên khỏi lớp học");
        System.out.println("6. Thoát chương trình");
        System.out.print("Chọn: ");
    }

    public TechMaster inputTech() {
        Manager manager = new Manager();
        manager.inputInfo();
        Lecture lecture = new Lecture();
        lecture.inputInfo();
        ClassTech classTech = new ClassTech();
        classTech.inputClass();
        return new TechMaster(manager, lecture, classTech);
    }

    public void removeStudent() {
        if (techMaster == null) {
            System.out.println("Bạn chưa nhập thông tin lớp học");
        } else {
            ArrayList<Student> student = techMaster.getClassTech().getStudents();
            int num = 0;
            boolean flag = true;
            do {
                do {
                    try {
                        System.out.println("Nhập mã học viên cần xoá: ");
                        num = Integer.parseInt(Main.sc.nextLine());
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
                        System.out.println("Đã xoá học viên mang mã " + num);
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.println("Không có học viên nào mang mã " + num);
                }
            } while (flag);

            System.out.println("Danh sách học viên hiện tại của lớp là: ");
            for (Student i : student) {
                System.out.println(i);
            }
        }
    }


    public void setLevel(Scanner sc) {
        if (techMaster == null) {
            System.out.println("Bạn chưa nhập thông tin lớp học");
        } else {
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
                        System.out.println("Đã sửa học lực, thông tin học sinh hiện tại là: ");
                        System.out.println(i);
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.println("Không có học viên nào mang mã " + num);
                }
            } while (flag);
        }
    }

    public void showClass() {
        if (techMaster == null) {
            System.out.println("Bạn chưa nhập thông tin lớp học");
        } else {
            System.out.println(techMaster);
        }
    }

    public void addStudent() {
        if (techMaster == null) {
            System.out.println("Bạn cần nhập thông tin lớp học");
        } else {
            Student student = new Student();
            student.inputInfo();
            techMaster.getClassTech().getStudents().add(student);
            System.out.println("Đã thêm học viên, thông tin của lớp hiện tại là: ");
            showClass();
        }
    }

}
