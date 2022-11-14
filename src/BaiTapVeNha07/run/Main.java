package BaiTapVeNha07.run;

import BaiTapVeNha07.entity.Buses;
import BaiTapVeNha07.entity.Driver;
import BaiTapVeNha07.entity.DriverAssignment;
import BaiTapVeNha07.entity.DriverAssignmentDetail;

import java.util.Scanner;

import static BaiTapVeNha07.logic_handle.BusesLogic.*;
import static BaiTapVeNha07.logic_handle.DriverLogic.*;

public class Main {

    public static Driver[] drivers = new Driver[100];
    public static Buses[] busesS = new Buses[100];
    public static DriverAssignment[] driverAssignments = new DriverAssignment[100];

    public static void main(String[] args) {
        while (true) {
            ShowMenu();

            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice >= 1 && functionChoice <= 8) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            } while (true);

            switch (functionChoice) {
                case 1:
                    NewDriver();
                    break;
                case 2:
                    ShowDriver();
                    break;
                case 3:
                    NewBuses();
                    break;
                case 4:
                    ShowBuses();
                    break;
                case 5:
                    driverAssignment();
                    printdriverAssignment();
                    break;
                case 6:
                    softDriver();
                    break;
                case 7:
                    summary();
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }

    private static void summary() {
        int turn;
        int distance;
        int sum;
        DriverAssignmentDetail[] driverAssignmentDetails;
        for (int i = 0; i < driverAssignments.length; i++) {
            if (driverAssignments[i] == null) {
                break;
            }

            driverAssignmentDetails = driverAssignments[i].getDriverAssignmentDetails();
            Driver driver = driverAssignments[i].getDriver();
            turn = driverAssignmentDetails[i].getTurn();
            distance = driverAssignmentDetails[i].getBuses().getDistance();
            sum = turn + distance*2;
            System.out.println("Tổng khoảng cách chạy xe trong ngày của tài xế có id " + driver.getDriverID() + " là: " + sum);
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
        if (!checkDriverAndBuses()) {
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
                driver = findDriverById(DriverId);

                boolean term1 = true;
                if (i > 0) {
                    term1 = findDriverIdValid(DriverId);
                }

                if (term1 && (driver != null)) {
                    break;
                }
                if (driver == null) {
                    System.out.println("Không tìm thấy tài xế mang mã: " + DriverId + " . Vui lòng nhập lại.");
                }

            } while (true);

            System.out.println("Lái xe này muốn chạy mấy tuyến?");
            int NumBuses;
            int term = checkBusesNumberValid();
            do {
                NumBuses = new Scanner(System.in).nextInt();
                if (NumBuses == 0) {
                    System.out.println("Vui lòng nhập số lượng chuyến lớn hơn 0");
                }
                if (NumBuses <= term) {
                    break;
                }
                System.out.println("Số tuyến vừa nhập vượt quá số lượng tuyến hiện có");
                term = 0;
            } while (true);

            DriverAssignmentDetail[] driverAssignmentDetails = new DriverAssignmentDetail[NumBuses];
            int count = 0;
            int turnNum = 0;
            do {
                for (int j = 0; j < NumBuses; j++) {
                    System.out.println("Nhập mã chuyến muốn chạy: ");
                    Buses buses = null;
                    int BusesId;
                    do {
                        BusesId = new Scanner(System.in).nextInt();
                        buses = findBusesById(BusesId);
                        boolean term1 = true;
                        if (j > 0) {
                            for (int k = 0; k < driverAssignmentDetails.length; k++) {
                                if (driverAssignmentDetails[k] != null && BusesId == driverAssignmentDetails[k].getBuses().getBusesId()) {
                                    term1 = false;
                                    System.out.println("Chuyến có mã " + BusesId + " đã được phân công");
                                    break;
                                }
                            }
                        }

                        if ((buses != null) && term1) {
                            break;
                        }

                        if (buses == null) {
                            System.out.println("Không tìm thấy chuyến mang mã: " + BusesId + " . Vui lòng nhập lại.");
                        }
                        buses = null;
                    } while (true);


                    System.out.print("Nhập số luợt muốn chạy trên tuyến " + BusesId + ": ");
                    int turns;
                    do {
                        turns = new Scanner(System.in).nextInt();
                        if (turns > 0) {
                            turnNum += turns;
                            break;
                        }
                        System.out.println("Số lượt chạy không tồn tại, vui lòng nhập lại");
                    } while (true);

                    driverAssignmentDetails[count] = new DriverAssignmentDetail(buses, turns);
                    count++;
                }
                if (turnNum <= 15) {
                    break;
                }
                System.out.println("Tổng số lượt của lái xe này đã vượt quá 15. Vui lòng phân công lại");
                turnNum = 0;
                count = 0;
            } while (true);

            DriverAssignment driverAssignment = new DriverAssignment(driver, driverAssignmentDetails);
            driverAssignment.setTotalTurn(turnNum);
            saveDriverAssign(driverAssignment);

        }
    }

    private static boolean checkDriverAndBuses() {
        boolean isDriver = false;
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                isDriver = true;
                break;
            }
        }

        boolean isBuses = false;
        for (int i = 0; i < busesS.length; i++) {
            if (busesS[i] != null) {
                isBuses = true;
                break;
            }
        }

        return isBuses && isDriver;
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

