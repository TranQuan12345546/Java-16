package techmaster.logic;

import techmaster.entity.Student;
import techmaster.main.Main;

import java.util.ArrayList;

public class LogicHandle {
    public static void showMenu() {
        System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ TECH-MASTER--------");
        System.out.println("1. Nhập thông tin trung tâm");
        System.out.println("2. Hiển thị thông tin trung tâm");
        System.out.println("3. Thêm học viên");
        System.out.println("4. Cập nhật thông tin học lực của học viên");
        System.out.println("5. Xoá học viên khỏi lớp học");
        System.out.println("6. Thoát chương trình");
    }

    public static void removeStudent() {
        ArrayList<Student> student = Main.techMaster.getClassTech().getStudents();
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
}
