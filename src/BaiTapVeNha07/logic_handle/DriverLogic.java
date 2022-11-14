package BaiTapVeNha07.logic_handle;

import BaiTapVeNha07.entity.Driver;
import BaiTapVeNha07.entity.DriverAssignment;
import BaiTapVeNha07.run.Main;

import java.util.Scanner;




public class DriverLogic {
    public static boolean findDriverIdValid(int id) {
        boolean term1 = true;
        for (int k = 0; k < Main.driverAssignments.length; k++) {
            if (Main.driverAssignments[k] != null && id == Main.driverAssignments[k].getDriver().getDriverID()) {
                term1 = false;
                System.out.println("Tài xế có mã " + id + " đã được phân công");
                break;
            }
        }
        return term1;
    }

    public static Driver findDriverById(int id) {
        Driver driver = null;
        for (int j = 0; j < Main.drivers.length; j++) {
            if (Main.drivers[j] != null && id == Main.drivers[j].getDriverID()) {
                driver = Main.drivers[j];
                break;
            }
        }
        return driver;
    }

    public static void NewDriver() {
        System.out.println("Nhập số lượng lái xe muốn thêm: ");
        int numDriver = new Scanner(System.in).nextInt();
        for (int i = 0; i < numDriver; i++) {
            Driver driver = new Driver();
            driver.ImportDriver();
            for (int j = 0; j < Main.drivers.length; j++) {
                if (Main.drivers[i] == null) {
                    Main.drivers[i] = driver;
                    break;
                }
            }
        }
    }

    public static void ShowDriver() {
        for (Driver driver : Main.drivers) {
            if (driver != null) {
                System.out.println(driver);
            }
        }
    }

    public static void saveDriverAssign(DriverAssignment driverAssignment) {
        for (int i = 0; i < Main.driverAssignments.length; i++) {
            if (Main.driverAssignments[i] == null) {
                Main.driverAssignments[i] = driverAssignment;
                break;
            }
        }
    }

    public static void softDriver() {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Sắp xếp theo tên lái xe.");
        System.out.println("2. Sắp xếp theo số lượng tuyến đảm nhận trong ngày (giảm dần).");
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
                case 1: softByDriverName();
                    break;
                case 2: softByTotalTurn();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void softByTotalTurn() {
        for (int i = 0; i < Main.drivers.length - 1; i++) {
            if (Main.drivers[i] == null) {
                continue;
            }

            for (int j = i + 1; j < Main.drivers.length; j++) {
                if (Main.drivers[j] == null) {
                    continue;
                }

                if (Main.driverAssignments[i].getTotalTurn() < Main.driverAssignments[j].getTotalTurn()) {
                    Driver max = Main.drivers[i];
                    Main.drivers[i] = Main.drivers[j];
                    Main.drivers[j] = max;
                }
            }
        }
        ShowDriver();
    }

    public static void softByDriverName() {
        for (int i = 0; i < Main.drivers.length - 1; i++) {
            if (Main.drivers[i] == null) {
                continue;
            }
            for (int j = i + 1; j < Main.drivers.length; j++) {
                if (Main.drivers[j] == null) {
                    continue;
                }
                if (Main.drivers[i].getName().compareTo(Main.drivers[j].getName()) > 0) {
                    Driver temp = Main.drivers[i];
                    Main.drivers[i] = Main.drivers[j];
                    Main.drivers[j] = temp;
                }
            }
        }
        ShowDriver();
    }
}
