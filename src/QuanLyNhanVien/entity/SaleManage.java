package QuanLyNhanVien.entity;

import java.util.Arrays;

public class SaleManage {
    private Sale sale;
    private Item[] item;

    public SaleManage(Sale sale, Item[] item) {
        this.sale = sale;
        this.item = item;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "SaleManage{" +
                "sale=" + sale +
                ", item=" + Arrays.toString(item) +
                '}';
    }
}
