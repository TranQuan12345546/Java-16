package QuanLyNhuanBut.entity;

import java.util.Scanner;

public class TypePost {
    public static int IDPOST = 100;
    private final int idPost;
    private String namePost;
    private String price;

    public TypePost() {
        this.idPost = IDPOST;
        IDPOST++;
    }


    public void addTypePost() {
        System.out.println("Nhập tên kiểu bài: ");
        namePost = new Scanner(System.in).nextLine();
        System.out.println("Nhập đơn giá: ");
        price = new Scanner(System.in).nextLine();
    }
}
