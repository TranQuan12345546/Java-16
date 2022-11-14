package QuanLyNhanVien.entity;

import QuanLyNhanVien.Constance.GroupContance;

import java.util.Scanner;

public class Item {
    public static int ITEM_ID = 1000;

    private final int itemId;
    private String name;
    private String group;
    private int price;
    private int amount;

    public Item(int itemId, String name, String group, int price, int amount) {
        this.itemId = itemId;
        this.name = name;
        this.group = group;
        this.price = price;
        this.amount = amount;
    }

    public Item() {
        this.itemId = ITEM_ID;
        ITEM_ID++;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", price='" + price + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void importItem() {
        System.out.println("Nhập tên mặt hàng: ");
        this.name = new Scanner(System.in).nextLine();
        chooseGroup();

        System.out.println("Nhập giá bán mặt hàng: ");
        this.price = new Scanner(System.in).nextInt();
        System.out.println("Nhập số lượng: ");
        this.amount = new Scanner(System.in).nextInt();
    }

    private void chooseGroup() {
        System.out.println("Chọn 1 trong các nhóm hàng sau: ");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn 1 trong 4 loại trên.");
        } while (true);
        switch (choice) {
            case 1: this.group = GroupContance.ELECTRONIC.value;
                break;
            case 2: this.group = GroupContance.REFRIGERATION.value;
                break;
            case 3: this.group = GroupContance.COMPUTER.value;
                break;
            case 4: this.group = GroupContance.OFFICESUPPLY.value;
                break;
        }
    }
}
