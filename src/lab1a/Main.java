package lab1a;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.inputInfo();
        students.add(student);
        do {
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
