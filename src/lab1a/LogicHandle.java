package lab1a;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicHandle {
    ArrayList<Student> students = new ArrayList<>();
    public void addInfo() {
        Student student = new Student();
        student.inputInfo();
        students.add(student);
    }

    public void askForInput() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn có muốn thêm thông tin người tiếp theo không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choose;
            do {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                } catch (Exception e ) {
                    System.out.println("Bạn cần chọn 1 trong 2 phương án");
                    continue;
                }
                if (choose == 1 || choose == 2) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            } while (true);
            if (choose == 1) {
                Student student1 = new Student();
                student1.inputInfo();
                students.add(student1);
            }
            if (choose == 2) {
                for (Student i : students) {
                    System.out.println(i);
                }
                break;
            }
        } while (true);
    }
}
