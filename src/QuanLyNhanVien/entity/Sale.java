package QuanLyNhanVien.entity;

import java.util.Scanner;

public class Sale extends Person{

    public static int SALE_ID = 1000;

    private final int saleId;
    private String signDate;

    public Sale() {
        this.saleId = SALE_ID;
        SALE_ID++;
    }

    public int getSaleId() {
        return saleId;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", signDate=" + signDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        System.out.println("Nhập ngày kí hợp đồng: ");
        this.signDate = new Scanner(System.in).nextLine();
    }
}
