package BaiTapVeNha07.entity;

import java.util.Arrays;

public class DriverAssignment {

    private Driver driver;

    private DriverAssignmentDetail[] driverAssignmentDetails;

    private int totalTurn;

    public int getTotalTurn() {
        return totalTurn;
    }

    public void setTotalTurn(int totalTurn) {
        this.totalTurn = totalTurn;
    }

    public DriverAssignment(Driver driver, DriverAssignmentDetail[] driverAssignmentDetails) {
        this.driver = driver;
        this.driverAssignmentDetails = driverAssignmentDetails;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverAssignmentDetail[] getDriverAssignmentDetails() {
        return driverAssignmentDetails;
    }

    public void setDriverAssignmentDetails(DriverAssignmentDetail[] driverAssignmentDetails) {
        this.driverAssignmentDetails = driverAssignmentDetails;
    }

    @Override
    public String toString() {
        return "DriverAssignment{" +
                "driver=" + driver +
                ", driverAssignmentDetails=" + Arrays.toString(driverAssignmentDetails) +
                '}';
    }
}
