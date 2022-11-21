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
        this.subject = new Scanner(System.in).nextLine();
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Số lượng học viên trong lớp là: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            Student student = new Student();
            student.inputInfo();
            students.add(student);
        }
        this.students = students;
    }
}
