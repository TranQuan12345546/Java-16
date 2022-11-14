package QuanLyNhanVien.LogicHandle;

import BaiTapVeNha07.entity.Driver;
import QuanLyNhanVien.Run.Main;
import QuanLyNhanVien.entity.Sale;
import QuanLyNhanVien.entity.SaleManage;

import java.util.Scanner;

import static QuanLyNhanVien.Run.Main.showSaleManage;

public class SaleLogic {
    public static void addSale() {
        System.out.println("Nhập số lượng nhân viên muốn thêm: ");
        int numSale = new Scanner(System.in).nextInt();
        while (numSale <= 0) {
            System.out.println("Vui lòng nhập số lớn hơn 0");
            numSale = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < numSale; i++) {
            Sale sale = new Sale();
            sale.InputInfo();
            for (int j = 0; j < Main.sales.length; j++) {
                if (Main.sales[i] == null) {
                    Main.sales[i] = sale;
                    break;
                }
            }
        }
    }

    public static void showSale() {
        for (int i = 0; i < Main.sales.length; i++) {
            if (Main.sales[i] != null) {
                System.out.println(Main.sales[i]);
            }
        }
    }

    public static void softBySaleName() {
        for (int i = 0; i < Main.saleManages.length - 1; i++) {
            if (Main.saleManages[i] == null) {
                continue;
            }
            for (int j = i + 1; j < Main.saleManages.length; j++) {
                if (Main.saleManages[j] == null) {
                    continue;
                }
                if (Main.saleManages[i].getSale().getName().compareTo(Main.saleManages[j].getSale().getName()) > 0) {
                    SaleManage temp = Main.saleManages[i];
                    Main.saleManages[i] = Main.saleManages[j];
                    Main.saleManages[j] = temp;
                }
            }
        }
        showSaleManage();
    }

    public static void softByGroup() {
        for (int i = 0; i < Main.saleManages.length - 1; i++) {
            if (Main.saleManages[i] == null) {
                continue;
            }
            for (int j = i + 1; j < Main.saleManages.length; j++) {
                if (Main.saleManages[j] == null) {
                    continue;
                }
                if (Main.saleManages[i].getSale().().compareTo(Main.saleManages[j].getSale().getName()) > 0) {
                    SaleManage temp = Main.saleManages[i];
                    Main.saleManages[i] = Main.saleManages[j];
                    Main.saleManages[j] = temp;
                }
            }
        }
        showSaleManage();
    }

}
