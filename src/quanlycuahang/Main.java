package quanlycuahang;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 6) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            } while (true);

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateNumProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    System.exit(0);
        }

    }

}

    private static void findProduct() {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Tìm kiếm theo tên sản phẩm.");
        System.out.println("2. Tìm kiếm theo id sản phẩm.");
        System.out.println("3. Tìm các sản phẩm có số lượng dưới 5.");
        System.out.println("4. Tìm sản phẩm theo mức giá.");

        int choose;
        do {
            choose  = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 4) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
        } while (true);

        switch (choose) {
            case 1: findNameProduct();
                break;
            case 2: findIdProduct();
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    private static void findIdProduct() {
        System.out.println("Nhập mã sản phẩm muốn tìm: ");
        int idProduct = new Scanner(System.in).nextInt();
        System.out.println("Chọn 1 trong 2 chức năng sau: ");
        System.out.println("1. Xoá sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        int chooseFunction = new Scanner(System.in).nextInt();
        if (chooseFunction == 1) {
            deleteProduct(idProduct);
        }
        if (chooseFunction == 2) {
            updateNumProduct(idProduct);
        }
    }

    private static void findNameProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String nameProduct = new Scanner(System.in).nextLine();
        for (Product i : products) {
            String a = i.getName();
            if (a.equals(nameProduct)) {
                System.out.println(i);
            } else {
                System.out.println("Không tìm thấy sản phẩm bạn vừa nhập");
            }
        }
    }

    private static void updateNumProduct(int idUpdateNumProduct) {
        System.out.println("Số lượng sản phẩm mới là: ");
        int newNumProduct = new Scanner(System.in).nextInt();
        for (Product i : products) {
            int a = i.getId();
            if (a == idUpdateNumProduct) {
                i.setNumber(newNumProduct);
            }
        }
    }

    private static void deleteProduct(int idProductDelete) {
        for (Product i : products) {
            int a = i.getId();
            if (a == idProductDelete) {
                products.remove(i);
            }
        }
    }

    private static void showProduct() {
        for (Product i : products) {
            System.out.println(i);
        }
    }

    private static void addProduct() {
        System.out.println("Nhập số lượng sản phẩm muốn thêm: ");
        int numProduct = new Scanner(System.in).nextInt();
        for (int i = 0; i < numProduct; i++) {
            System.out.println("Nhập dữ liệu cho sản phẩm thứ " + (i+1));
            Product product = new Product();
            product.InputInfo();
            products.add(product);
        }
    }

    private static void showMenu() {
        System.out.println("-------CHƯƠNG TRÌNH QUẢN LÝ CỬA HÀNG-------");
        System.out.println("1. THÊM SẢN PHẨM");
        System.out.println("2. XEM DANH SÁCH SẢN PHẨM");
        System.out.println("3. XOÁ SẢN PHẨM");
        System.out.println("4. CẬP NHẬT SỐ LƯỢNG SẢN PHẨM");
        System.out.println("5. TÌM KIẾM SẢN PHẨM");
        System.out.println("6. THOÁT CHƯƠNG TRÌNH");
    }
}
