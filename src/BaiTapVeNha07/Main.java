package BaiTapVeNha07;

import BaiTapVeNha07.entity.Buses;
import BaiTapVeNha07.entity.Driver;

import java.util.Scanner;

public class Main {

    static Driver[] drivers = new Driver[100];
    static Buses[] busesS = new Buses[100];

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
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);

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
                }
            }
        }
    }

    private static void ShowDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                System.out.println(drivers[i]);
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
        System.out.println("5. Nhập danh sách phân công cho các sinh viên và in danh sách: ");
        System.out.println("6. Sắp xếp danh sách các lái xe: ");
        System.out.println("7. Bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe: ");
        System.out.println("8. Thoát chương trình.");
    }
}

