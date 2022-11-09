package BaiTapVeNha06.MuonSach.entity;

import BaiTapVeNha06.MuonSach.constant.CategoriesType;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book {

    public static int AUTO_ID_BOOK = 0;
    private final int id;
    private String bookName;
    private String author;
    private String categories;
    private String yearRelease;

    public Book() {
        if (AUTO_ID_BOOK == 0) {
            AUTO_ID_BOOK = 10000;
        }
        this.id = AUTO_ID_BOOK;
        AUTO_ID_BOOK++;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", categories='" + categories + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                '}';
    }


    public void NhapSach() {
        System.out.println("Mời nhập tên sách: ");
        bookName = new Scanner(System.in).nextLine();
        System.out.println("Mời nhập tên tác giả: ");
        author = new Scanner(System.in).nextLine();
        ChonChuyenNganh();
        System.out.println("Mời nhập năm xuất bản: ");
        yearRelease = new Scanner(System.in).nextLine();
    }

    private void ChonChuyenNganh() {
        System.out.println("Chọn 1 trong các chuyên ngành sau: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học – Nghệ thuật");
        System.out.println("3. Điện tử Viễn thông");
        System.out.println("4. Công nghệ thông tin");
        int numCategories;
        do {
            numCategories = new Scanner(System.in).nextInt();
            if(numCategories >= 1 && numCategories <= 4) {
                break;
            }
            System.out.println("Chuyên ngành không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (numCategories) {
            case 1:
                this.categories = CategoriesType.SCIENCE;
                break;
            case 2:
                this.categories = CategoriesType.LITERATURE;
                break;
            case 3:
                this.categories = CategoriesType.ELECTRONIC;
                break;
            case 4:
                this.categories = CategoriesType.IT;
                break;
        }
    }

}
