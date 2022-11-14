package QuanLyNhanVien.Run;

import QuanLyNhanVien.entity.Item;
import QuanLyNhanVien.entity.Sale;
import QuanLyNhanVien.entity.SaleManage;

import java.util.Scanner;

import static QuanLyNhanVien.LogicHandle.ItemLogic.addItem;
import static QuanLyNhanVien.LogicHandle.ItemLogic.showItem;
import static QuanLyNhanVien.LogicHandle.SaleLogic.*;

public class Main {
    public static Sale[] sales = new Sale[100];
    public static Item[] items = new Item[100];
    public static SaleManage[] saleManages = new SaleManage[100];

    public static void main(String[] args) {
        while (true) {
            showMenu();

            int choose;
            do {
                choose = new Scanner(System.in).nextInt();
                if (choose >= 1 && choose <= 8) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            } while (true);
            switch (choose) {
                case 1:
                    addSale();
                    break;
                case 2:
                    showSale();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    showItem();
                    break;
                case 5:
                    saleManage();
                    break;
                case 6:
                    softSale();
                    break;
                case 7:
                    salary();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }

    private static void salary() {
        int total = 0;
        for (int i = 0; i < saleManages.length; i++) {
            if (saleManages[i] == null) {
                break;
            }

            Item[] item = saleManages[i].getItem();
            for (int j = 0; j < item.length; j++) {
                total += (item[j].getPrice() * item[j].getAmount());
            }
            System.out.println("Tổng lương của nhân viên " + saleManages[i].getSale().getName() + " là " + total);
        }
    }

    private static void softSale() {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Sắp xếp theo tên nhân viên.");
        System.out.println("2. Sắp xếp theo nhóm mặt hàng.");
        System.out.println("3. Quay trở lại menu");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        while (true) {
            switch (choice) {
                case 1: softBySaleName();
                    break;
                case 2: softByGroup();
                    break;
                case 3:
                    return;
            }
        }
    }




    private static void saleManage() {
        if (!checkSaleAndItem()) {
            System.out.println("Bạn cần nhập thông tin nhân viên và thông tin mặt hàng.");
            return;
        }

        System.out.println("Số lượng nhân viên cần thống kê là: ");
        int numSale = new Scanner(System.in).nextInt();

        for (int i = 0; i < numSale; i++) {
            System.out.println("Nhập mã nhân viên muốn thống kê: ");
            Sale sale;
            int saleId;
            do {
                saleId = new Scanner(System.in).nextInt();
                sale = findSaleById(saleId);

                boolean term1 = true;
                if (i > 0) {
                    term1 = findSaleIndValid(saleId);
                }

                if (term1 && (sale != null)) {
                    break;
                }
                if (sale == null) {
                    System.out.println("Không tìm thấy nhân viên mang mã: " + saleId + " . Vui lòng nhập lại.");
                }
            } while (true);

            System.out.println("Nhân viên này đã bán được bao nhiêu mặt hàng?");
            int numItemSold;
            do {
                numItemSold = new Scanner(System.in).nextInt();
                if (numItemSold >= 0 && numItemSold <= 5) {
                    break;
                }
                System.out.println("Mặt hàng bán được phải lớn hơn hoặc bằng 0 và nhỏ hơn 5");
            } while (true);

            Item[] items1 = new Item[numItemSold];
            for (int j = 0; j < numItemSold; j++) {
                System.out.println("Tên mặt hàng mà nhân viên đã bán: ");
                String nameItem;
                int term = 0;
                boolean term1 = true;
                do {
                    nameItem = new Scanner(System.in).nextLine();
                    for (int k = 0; k < items.length; k++) {
                        if (items[k] != null && nameItem.equals(items[k].getName())) {
                            term = k;
                            term1 = false;
                            break;
                        }
                    }
                    System.out.println("Tên mặt hàng vừa nhập không có trong danh sách mặt hàng");
                    if (j > 0) {
                        for (int k = 0; k < items1.length; k++) {
                            if (items1[k] != null && nameItem.equals(items1[k].getName())){
                                System.out.println("Mặt hàng này đã được thêm rồi.");
                                term1 = true;
                            }
                        }
                    }
                } while (term1);


                System.out.print("Số lượng mặt hàng này mà nhân viên bán được: ");
                int numAmount;
                do {
                    numAmount = new Scanner(System.in).nextInt();
                    if (numAmount >= 0 && numAmount <= items[term].getAmount()) {
                        break;
                    }
                    System.out.println("Số lượng bán được phải lớn hơn 0 và nhỏ hơn " + items[term].getAmount());
                } while (true);

                int newAmount = items[term].getAmount() - numAmount;
                items[term].setAmount(items[term].getAmount() - numAmount);

                Item item = new Item(items[term].getItemId(), items[term].getName(), items[term].getGroup(), items[term].getPrice(), newAmount);
                for (int k = 0; k < items1.length; k++) {
                    if (items1[k] == null) {
                        items1[k] = item;
                        break;
                    }
                }
            }
            SaleManage saleManage = new SaleManage(sale, items1);
            for (int k = 0; k < saleManages.length; k++) {
                if (saleManages[k] == null) {
                    saleManages[k] = saleManage;
                    break;
                }
            }

            showSaleManage();
        }
    }

    public static void showSaleManage() {
        for (int i = 0; i < saleManages.length; i++) {
            if (saleManages[i] != null) {
                System.out.println(saleManages[i]);
            }
        }
    }


    private static boolean findSaleIndValid(int saleId) {
        boolean term1 = true;
        for (int i = 0; i < saleManages.length; i++) {
            if (saleManages[i] != null && saleId == saleManages[i].getSale().getSaleId()) {
                term1 = false;
                System.out.println("Nhân viên có mã " + saleId + " đã được thống kê");
                break;
            }
        }
        return term1;
    }

    private static Sale findSaleById(int id) {
        Sale sale = null;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != null && id == sales[i].getSaleId()) {
                sale = sales[i];
                break;
            }
        }
        return sale;
    }

    private static boolean checkSaleAndItem() {
        boolean isSale = false;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != null) {
                isSale = true;
                break;
            }
        }

        boolean isItem = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                isItem = true;
                break;
            }
        }

        return isSale && isItem;
    }






    private static void showMenu() {
        System.out.println("---------PHẦN MỀM QUẢN LÝ NHÂN VIÊN BÁN HÀNG---------");
        System.out.println("1. Nhập nhân viên mới: ");
        System.out.println("2. In danh sách nhân viên hiện có: ");
        System.out.println("3. Nhập mặt hàng mới: ");
        System.out.println("4. In danh sách mặt hàng hiện có: ");
        System.out.println("5. Bảng danh sách bán hàng cho từng nhân viên: ");
        System.out.println("6. Sắp xếp Bảng danh sách bán hàng: ");
        System.out.println("7. Bảng kê doanh thu cho mỗi nhân viên: ");
        System.out.println("8. Thoát chương trình.");
        System.out.print("Lựa chọn của bạn là: ");
    }
}
