package BaiTapVeNha07.entity;

import java.util.Scanner;

public class Buses {
    public static int BUSES_ID = 100;

    private final int busesId;
    private int distance;
    private int busStop;

    public Buses() {
        this.busesId = BUSES_ID;
        BUSES_ID++;
    }

    public int getBusesId() {
        return busesId;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBusStop() {
        return busStop;
    }

    public void setBusStop(int busStop) {
        this.busStop = busStop;
    }

    public static void setBusesId(int busesId) {
        BUSES_ID = busesId;
    }

    @Override
    public String toString() {
        return "Buses{" +
                "busesId=" + busesId +
                ", distance=" + distance +
                ", busStop=" + busStop +
                '}';
    }

    public void ImportBuses() {
        System.out.print("Nhập khoảng cách: ");
        distance = new Scanner(System.in).nextInt();
        System.out.print("Nhập số điểm dừng: ");
        busStop = new Scanner(System.in).nextInt();
    }
}
