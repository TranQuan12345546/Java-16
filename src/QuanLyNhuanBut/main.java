package QuanLyNhuanBut;

import QuanLyNhuanBut.entity.Reporter;
import QuanLyNhuanBut.entity.TypePost;

import java.util.Scanner;

public class main {
    static Reporter[] reporters = new Reporter[100];
    static TypePost[] typePosts = new TypePost[100];

    public static void main(String[] args) {
        showMenu();
        while (true) {
            int numChoice;
            do {
                numChoice = new Scanner(System.in).nextInt();
                if (numChoice >= 1 && numChoice <=7){
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            } while (true);
            switch (numChoice) {
                case 1: addReporter();
                    break;
                case 2: showReporter();
                    break;
                case 3: addTypePost();
                    break;
                case 4: showTypePost();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    private static void showTypePost() {
        System.out.println("Danh sách kiểu bài viết: ");
        for (int i = 0; i < typePosts.length; i++) {
            if (typePosts[i] != null) {
                System.out.println(typePosts[i]);
            }
        }
    }

    private static void addTypePost() {
        System.out.println("Số lượng kiểu bài viết cần nhập: ");
        int numTypePost = new Scanner(System.in).nextInt();
        for (int i = 0; i < numTypePost ; i++) {
            TypePost typePost = new TypePost();
            typePost.addTypePost();
            for (int j = 0; j < typePosts.length; j++) {
                if (typePosts[j] == null) {
                    typePosts[j] = typePost;
                    break;
                }
            }
        }
    }

    private static void showReporter() {
        System.out.println("Danh sách phóng viên: ");
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }

    private static void addReporter() {
        System.out.println("Số lượng phóng viên cần nhập: ");
        int numReporter = new Scanner(System.in).nextInt();
        for (int i = 0; i < numReporter ; i++) {
            Reporter reporter = new Reporter();
            reporter.addReporter();
            for (int j = 0; j < reporters.length; j++) {
                if (reporters[j] == null) {
                    reporters[j] = reporter;
                    break;
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println("-----------PHẦN MỀM QUẢN LÝ NHUẬN BÚT-----------");
        System.out.println("1. Nhập danh sách phóng viên.");
        System.out.println("2. In danh sách phóng viên.");
        System.out.println("3. Nhập danh sách kiểu bài viết.");
        System.out.println("4. In danh sách kiểu bài viết.");
        System.out.println("5. Lập bảng tính công phóng viên.");
        System.out.println("6. Sắp xếp danh sách phóng viên.");
        System.out.println("7. Thoát chương trình.");
        System.out.println("Xin mòi chọn chức năng.");
    }
}
