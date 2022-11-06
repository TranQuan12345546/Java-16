package Baitapvenha05.Bai4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        double a = secondPoint.x - this.x;
        double b = secondPoint.y - this.y;
        return Math.sqrt(a*a + b*b);
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double a = p2.x - p1.x;
        double b = p2.y - p1.y;
        return Math.sqrt(a*a + b*b);
    }
}
