package techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassTech {
    private String subject;
    private ArrayList<Student> students;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassTech{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }

    public void inputClass() {
        System.out.println("Nhập môn học: ");
        this.subject = new Scanner(System.in).nextLine();
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            try {
                System.out.println("Số lượng học viên trong lớp là: ");
                num = Integer.parseInt(sc.nextLine());
                if (num <= 0) {
                    System.out.println("Số lượng học viên phải lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số tự nhiên");
            }

        } while (num <= 0);
        for (int i = 1; i <= num; i++) {
            Student student = new Student();
            student.inputInfo();
            students.add(student);
        }
        this.students = students;
    }
}
