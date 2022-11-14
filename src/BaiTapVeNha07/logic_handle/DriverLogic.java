package BaiTapVeNha07.logic_handle;

import BaiTapVeNha07.entity.Driver;
import BaiTapVeNha07.entity.DriverAssignment;

import java.util.Scanner;

import static BaiTapVeNha07.run.Main.driverAssignments;
import static BaiTapVeNha07.run.Main.drivers;

public class DriverLogic {
    public static boolean findDriverIdValid(int id) {
        boolean term1 = true;
        for (int k = 0; k < driverAssignments.length; k++) {
            if (driverAssignments[k] != null && id == driverAssignments[k].getDriver().getDriverID()) {
                term1 = false;
                System.out.println("Tài xế có mã " + id + " đã được phân công");
                break;
            }
        }
        return term1;
    }

    public static Driver findDriverById(int id) {
        Driver driver = null;
        for (int j = 0; j < drivers.length; j++) {
            if (drivers[j] != null && id == drivers[j].getDriverID()) {
                driver = drivers[j];
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
            for (int j = 0; j < drivers.length; j++) {
                if (drivers[i] == null) {
                    drivers[i] = driver;
                    break;
                }
            }
        }
    }

    public static void ShowDriver() {
        for (Driver driver : drivers) {
            if (driver != null) {
                System.out.println(driver);
            }
        }
    }

    public static void saveDriverAssign(DriverAssignment driverAssignment) {
        for (int i = 0; i < driverAssignments.length; i++) {
            if (driverAssignments[i] == null) {
                driverAssignments[i] = driverAssignment;
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
        for (int i = 0; i < drivers.length - 1; i++) {
            if (drivers[i] == null) {
                continue;
            }

            for (int j = i + 1; j < drivers.length; j++) {
                if (drivers[j] == null) {
                    continue;
                }

                if (driverAssignments[i].getTotalTurn() < driverAssignments[j].getTotalTurn()) {
                    Driver max = drivers[i];
                    drivers[i] = drivers[j];
                    drivers[j] = max;
                }
            }
        }
        ShowDriver();
    }

    public static void softByDriverName() {
        for (int i = 0; i < drivers.length - 1; i++) {
            if (drivers[i] == null) {
                continue;
            }
            for (int j = i + 1; j < drivers.length; j++) {
                if (drivers[j] == null) {
                    continue;
                }
                if (drivers[i].getName().compareTo(drivers[j].getName()) > 0) {
                    Driver temp = drivers[i];
                    drivers[i] = drivers[j];
                    drivers[j] = temp;
                }
            }
        }
        ShowDriver();
    }
}
