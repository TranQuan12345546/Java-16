package BaiTapVeNha06.DiemSinhVien;

import BaiTapVeNha06.DiemSinhVien.entity.Student;
import BaiTapVeNha06.DiemSinhVien.entity.Subject;
import BaiTapVeNha06.MuonSach.entity.Book;

import java.util.Scanner;

public class main {

    static Student[] students = new Student[100];
    static Subject[] subjects = new Subject[100];
    public static void main(String[] args) {
        while (true) {
            ShowMenu();

            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if(functionChoice >= 1 && functionChoice <= 8) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }while (true);

            switch (functionChoice){
                case 1: NewStudent();
                    break;
                case 2: ShowStudent();
                    break;
                case 3: NewSubject();
                    break;
                case 4: ShowSubject();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }

    private static void ShowSubject() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i]);
            }
        }
    }

    private static void NewSubject() {
        System.out.println("Nhập số lượng môn học muốn thêm: ");
        int numSubject = new Scanner(System.in).nextInt();
        for (int i = 0; i < numSubject; i++) {
            Subject subject = new Subject();
            subject.nhapMonHoc();
            for (int j = 0; j < subjects.length; j++) {
                if (subjects[i] == null) {
                    subjects[i] = subject;

                }
            }
        }
    }

    private static void ShowStudent() {
        for (int i = 0; i < students.length ; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    private static void NewStudent() {
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        int numStudent = new Scanner(System.in).nextInt();
        for (int i = 0; i < numStudent; i++) {
            Student student = new Student();
            student.nhapThongTin();
            for (int j = 0; j < students.length; j++) {
                if (students[i] == null) {
                    students[i] = student;
                }
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("---------PHẦN MỀM QUẢN LÝ SINH VIÊN---------");
        System.out.println("1. Nhập sinh viên mới: ");
        System.out.println("2. In danh sách sinh viên: ");
        System.out.println("3. Nhập môn học mới: ");
        System.out.println("4. In danh sách môn học: ");
        System.out.println("5. Nhập điểm cho các sinh viên và in điểm: ");
        System.out.println("6. Sắp xếp danh sách các sinh viên: ");
        System.out.println("7. Tính điểm tổng kết chung: ");
        System.out.println("8. Thoát chương trình.");
    }
}
