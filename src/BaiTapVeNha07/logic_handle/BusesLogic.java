package BaiTapVeNha07.logic_handle;

import BaiTapVeNha07.run.Main;
import BaiTapVeNha07.entity.Buses;

import java.util.Scanner;

import static BaiTapVeNha07.run.Main.busesS;

public class BusesLogic {
    public static Buses findBusesById(int id) {
        Buses buses = null;
        for (int k = 0; k < busesS.length; k++) {
            if (busesS[k] != null && id == busesS[k].getBusesId()) {
                buses = busesS[k];
                break;
            }
        }
        return buses;
    }

    public static int checkBusesNumberValid() {
        int term = 0;
        for (int j = 0; j < busesS.length; j++) {
            if (busesS[j] != null) {
                term++;
            }
            if (busesS[j] == null) {
                break;
            }
        }
        return term;
    }

    public static void ShowBuses() {
        for (int i = 0; i < busesS.length; i++) {
            if (busesS[i] != null) {
                System.out.println(busesS[i]);
            }
        }
    }

    public static void NewBuses() {
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
}
