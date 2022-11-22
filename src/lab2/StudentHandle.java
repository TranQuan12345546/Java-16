package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public ArrayList<Student> addInfo() {
        ArrayList<Student> students = new ArrayList<>();
        lab2.Student student = new lab2.Student();
        student.inputInfo();
        students.add(student);
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
                lab2.Student student1 = new lab2.Student();
                student1.inputInfo();
                students.add(student1);
            }
            if (choose == 2) {
                for (lab2.Student i : students) {
                    System.out.println(i);
                }
                break;
            }
        } while (true);
        return students;
    }

    public String checkLevel(double avg) {
        if (avg >= 8) {
           return "Xếp loại A";
        } else if (avg < 8 && avg >= 6.5) {
            return "Xếp loại B";
        } else {
            return "Xếp loại C";
        }
    }



}
