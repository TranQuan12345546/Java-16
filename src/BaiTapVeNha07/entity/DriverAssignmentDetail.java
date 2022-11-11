package BaiTapVeNha07.entity;

public class DriverAssignmentDetail {

    private Buses buses;
    private int turn;

    public DriverAssignmentDetail(Buses buses, int turn) {
        this.buses = buses;
        this.turn = turn;
    }

    public Buses getBuses() {
        return buses;
    }

    public void setBuses(Buses buses) {
        this.buses = buses;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "DriverAssignmentDetail{" +
                "buses=" + buses +
                ", turn=" + turn +
                '}';
    }
}
