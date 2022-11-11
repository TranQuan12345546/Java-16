package QuanLyNhuanBut.entity;

import QuanLyNhuanBut.Constance.TypeReporterCons;

import java.util.Scanner;

public class Reporter extends Person{
    public static int REPORTERID = 10000;
    private final int reporterID;
    private String reporterType;

    public Reporter() {
        this.reporterID = REPORTERID;
        REPORTERID++;
    }

    public int getReporterID() {
        return reporterID;
    }

    public String getReporterType() {
        return reporterType;
    }

    public void setReporterType(String reporterType) {
        this.reporterType = reporterType;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "reporterID=" + reporterID +
                ", reporterType='" + reporterType + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void reporterType() {
        System.out.print("Chọn loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp ");
        System.out.println("2. Nghiệp dư ");
        System.out.println("3. Cộng tác viên ");
        int numChoice;
        do {
            numChoice = new Scanner(System.in).nextInt();
            if (numChoice >= 1 && numChoice <=3){
                break;
            }
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        } while (true);
        switch (numChoice) {
            case 1: this.reporterType = TypeReporterCons.CHUYENNGHIEP.value;
                break;
            case 2: this.reporterType = TypeReporterCons.NGHIEPDU.value;
                break;
            case 3: this.reporterType = TypeReporterCons.CONGTACVIEN.value;
                break;
        }
    }


    public void addReporter() {
        super.addPerson();
        reporterType();
    }
}
