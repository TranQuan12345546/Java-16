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
                if (choice >= 1 && choice <= 4) {
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
                    findProduct();
                    break;
                case 4:
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
            case 3: findProductLessThan5();
                break;
            case 4: findProductPrice();
                break;
        }
    }

    private static void findProductPrice() {
        System.out.println("Chọn mức giá: ");
        System.out.println("Dưới 50.000");
        System.out.println("Từ 50.000 đến dưới 100.000");
        System.out.println("Từ 100.000 trở lên");

        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1: findCase1();
                break;
            case 2: findCase2();
                break;
            case 3: findCase3();
                break;
        }

    }

    private static void findCase3() {
        for (Product i : products) {
            int price = i.getPrice();
            if (price >= 100000) {
                System.out.println(i);
            }
        }
    }

    private static void findCase2() {
        for (Product i : products) {
            int price = i.getPrice();
            if (price >= 50000 && price <= 100000) {
                System.out.println(i);
            }
        }
    }

    private static void findCase1() {
        for (Product i : products) {
            int price = i.getPrice();
            if (price < 50000) {
                System.out.println(i);
            }
        }
    }

    private static void findProductLessThan5() {
        for (Product i : products) {
            int num = i.getNumber();
            if (num < 5) {
                System.out.println(i);
            }
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
        System.out.println("3. TÌM KIẾM SẢN PHẨM");
        System.out.println("4. THOÁT CHƯƠNG TRÌNH");
    }
}
