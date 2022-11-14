package BaiTapVeNha07.logic_handle;

import BaiTapVeNha07.run.Main;
import BaiTapVeNha07.entity.Buses;

import java.util.Scanner;

public class BusesLogic {
    public static Buses findBusesById(int id) {
        Buses buses = null;
        for (int k = 0; k < Main.busesS.length; k++) {
            if (Main.busesS[k] != null && id == Main.busesS[k].getBusesId()) {
                buses = Main.busesS[k];
                break;
            }
        }
        return buses;
    }

    public static int checkBusesNumberValid() {
        int term = 0;
        for (int j = 0; j < Main.busesS.length; j++) {
            if (Main.busesS[j] != null) {
                term++;
            }
            if (Main.busesS[j] == null) {
                break;
            }
        }
        return term;
    }

    public static void ShowBuses() {
        for (int i = 0; i < Main.busesS.length; i++) {
            if (Main.busesS[i] != null) {
                System.out.println(Main.busesS[i]);
            }
        }
    }

    public static void NewBuses() {
        System.out.println("Nhập số lượng chuyến muốn thêm: ");
        int numBuses = new Scanner(System.in).nextInt();
        for (int i = 0; i < numBuses; i++) {
            Buses buses = new Buses();
            buses.ImportBuses();
            for (int j = 0; j < Main.busesS.length; j++) {
                if (Main.busesS[i] == null) {
                    Main.busesS[i] = buses;
                    break;
                }
            }
        }
    }
}
