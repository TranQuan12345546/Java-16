package BaiTapVeNha06.MuonSach;

import BaiTapVeNha06.MuonSach.entity.Book;
import BaiTapVeNha06.MuonSach.entity.Person;
import BaiTapVeNha06.MuonSach.entity.Reader;

import java.util.Scanner;

public class Main {

    static Book[] books = new Book[100];
    static Reader[] readers = new Reader[100];

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
                case 1: NewBook();
                    break;
                case 2: ShowBook();
                    break;
                case 3: NewReader();
                    break;
                case 4: ShowReader();
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

    private static void ShowReader() {
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null) {
                System.out.println(readers[i]);
            }
        }
    }

    private static void NewReader() {
        System.out.println("Nhập số lượng bạn đọc muốn thêm: ");
        int numReader = new Scanner(System.in).nextInt();
        for (int i = 0; i < numReader; i++) {
            Reader reader = new Reader();
            reader.nhapThongTin();
            for (int j = 0; j < readers.length; j++) {
                if (readers[i] == null) {
                    readers[i] = reader;
                }
            }
        }
    }

    private static void ShowBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("---------PHẦN MỀM QUẢN LÝ MƯỢN SÁCH---------");
        System.out.println("1. Nhập đầu sách mới: ");
        System.out.println("2. In danh sách đầu sách: ");
        System.out.println("3. Nhập bạn đọc mới: ");
        System.out.println("4. In danh sách bạn đọc: ");
        System.out.println("5. Bảng quản lý mượn sách: ");
        System.out.println("6. Sắp xếp danh sách: ");
        System.out.println("7. Tìm kiếm và hiện thị danh sách: ");
        System.out.println("8. Thoát chương trình.");
    }

    private static void NewBook() {
        System.out.println("Nhập số lượng đầu sách muốn thêm: ");
        int numBook = new Scanner(System.in).nextInt();
        for (int i = 0; i < numBook; i++) {
            Book book = new Book();
            book.NhapSach();
            for (int j = 0; j < books.length; j++) {
                if (books[i] == null) {
                    books[i] = book;
                }
            }
        }
    }


}
