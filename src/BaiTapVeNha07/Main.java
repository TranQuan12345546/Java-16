package BaiTapVeNha07;

import BaiTapVeNha07.entity.Buses;
import BaiTapVeNha07.entity.Driver;
import BaiTapVeNha07.entity.DriverAssignment;
import BaiTapVeNha07.entity.DriverAssignmentDetail;

import java.util.Scanner;

public class Main {

    static Driver[] drivers = new Driver[100];
    static Buses[] busesS = new Buses[100];
    static DriverAssignment[] driverAssignments = new DriverAssignment[100];

    public static void main(String[] args) {
        while (true) {
            ShowMenu();

            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if(functionChoice >= 1 && functionChoice <= 8) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }while (true);

            switch (functionChoice){
                case 1: NewDriver();
                    break;
                case 2: ShowDriver();
                    break;
                case 3: NewBuses();
                    break;
                case 4: ShowBuses();
                    break;
                case 5:
                    driverAssignment();
                    printdriverAssignment();
                    break;
                case 6: softDriver();
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }

    private static void softDriver() {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Sắp xếp theo tên lái xe.");
        System.out.println("2. Sắp xếp theo số lượng tuyến đảm nhận trong ngày (giảm dần).");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice == 1 || choice == 2) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        if (choice == 1) { // sắp xếp theo tên bạn đọc
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
        } else if (choice == 2) { // sắp xếp theo số lượng cuốn sách

        }
    }

    private static void printdriverAssignment() {
        for (int i = 0; i < driverAssignments.length; i++) {
            if (driverAssignments[i] != null) {
                System.out.println(driverAssignments[i]);
            }
        }
    }

    private static void driverAssignment() {
        if(drivers.length == 0 || busesS.length == 0) {
            System.out.println("Bạn cần nhập thông tin tài xế và thông tin tuyến xe.");
            return;
        }


        System.out.println("Số lượng lái xe cần phân công là: ");
        int NumDriver = new Scanner(System.in).nextInt();

        for (int i = 0; i < NumDriver; i++) {
            System.out.println("Nhập mã lái xe muốn phân công: ");
            Driver driver = null;
            int DriverId;
            do {
                DriverId = new Scanner(System.in).nextInt();
                for (int j = 0; j < drivers.length; j++) {
                    if(DriverId == drivers[j].getDriverID()){
                        driver = drivers[j];
                        break;
                    }
                }
                if(driver != null) {
                    break;
                }
                System.out.println("Không tìm thấy tài xế mang mã: " + DriverId + " . Vui lòng nhập lại.");
            } while (true);

            System.out.println("Lái xe này muốn chạy mấy tuyến?");
            int NumBuses = new Scanner(System.in).nextInt();
            DriverAssignmentDetail[] driverAssignmentDetails = new DriverAssignmentDetail[NumBuses];
            int count = 0;
            int turnNum = 0;

            do {
                for (int j = 0; j < NumBuses; j++) {
                    System.out.print("Nhập mã chuyến muốn chạy: ");
                    Buses buses = null;
                    int BusesId;
                    do {
                        BusesId = new Scanner(System.in).nextInt();
                        for (int k = 0; k < busesS.length; k++) {
                            if(busesS[k].getBusesId() == BusesId){
                                buses = busesS[k];
                                break;
                            }
                        }
                        if(buses != null) {
                            break;
                        }
                        System.out.println("Không tìm thấy tuyến mang mã: " + BusesId + " . Vui lòng nhập lại.");
                    } while (true);

                    System.out.println("Nhập số luợt muốn chạy trên tuyến" + BusesId);
                    int turns;
                    do {
                        turns = new Scanner(System.in).nextInt();
                        if(turns > 0) {
                            turnNum += turns;
                            break;
                        }
                        System.out.println("Số lượt chạy không tồn tại, vui lòng nhập lại");
                    } while (true);

                    driverAssignmentDetails[count] = new DriverAssignmentDetail(buses, turns);
                    count++;
                }
                if (turnNum < 15) {
                    break;
                }
                System.out.println("Tổng số lượt của lái xe này đã vượt quá 15. Vui lòng phân công lại");
            } while (true);

            DriverAssignment driverAssignment = new DriverAssignment(driver, driverAssignmentDetails);
            saveDriverAssign(driverAssignment);
        }
    }

    private static void saveDriverAssign(DriverAssignment driverAssignment) {
        for (int i = 0; i < driverAssignments.length; i++) {
            if (driverAssignments[i] == null) {
                driverAssignments[i] = driverAssignment;
                break;
            }
        }
    }

    private static void ShowBuses() {
        for (int i = 0; i < busesS.length; i++) {
            if (busesS[i] != null) {
                System.out.println(busesS[i]);
            }
        }
    }

    private static void NewDriver() {
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

    private static void ShowDriver() {
        for (Driver driver : drivers) {
            if (driver != null) {
                System.out.println(driver);
            }
        }
    }

    private static void NewBuses() {
        System.out.println("Nhập số lượng chuyến muốn thêm: ");
        int numBuses = new Scanner(System.in).nextInt();
        for (int i = 0; i < numBuses; i++) {
            Buses buses = new Buses();
            buses.ImportBuses();
            for (int j = 0; j < busesS.length; j++) {
                if (busesS[i] == null) {
                    busesS[i] = buses;
                    break;
                }
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("---------PHẦN MỀM QUẢN LÝ LÁI XE---------");
        System.out.println("1. Nhập lái xe mới: ");
        System.out.println("2. In danh sách lái xe: ");
        System.out.println("3. Nhập tuyến mới: ");
        System.out.println("4. In danh sách tuyến: ");
        System.out.println("5. Nhập danh sách phân công cho các lái xe và in danh sách: ");
        System.out.println("6. Sắp xếp danh sách các lái xe: ");
        System.out.println("7. Bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe: ");
        System.out.println("8. Thoát chương trình.");
    }
}

