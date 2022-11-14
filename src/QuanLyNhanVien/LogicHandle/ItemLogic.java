package QuanLyNhanVien.LogicHandle;

import QuanLyNhanVien.Run.Main;
import QuanLyNhanVien.entity.Item;

import java.util.Scanner;

public class ItemLogic {
    public static void addItem() {
        System.out.println("Nhập số lượng mặt hàng muốn thêm: ");
        int numItem = new Scanner(System.in).nextInt();
        while (numItem <= 0) {
            System.out.println("Vui lòng nhập số lớn hơn 0");
            numItem = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < numItem; i++) {
            Item item = new Item();
            item.importItem();
            for (int j = 0; j < Main.items.length; j++) {
                if (Main.items[i] == null) {
                    Main.items[i] = item;
                    break;
                }
            }
        }
    }

    public static void showItem() {
        for (int i = 0; i < Main.items.length; i++) {
            if (Main.items[i] != null) {
                System.out.println(Main.items[i]);
            }
        }
    }
}
