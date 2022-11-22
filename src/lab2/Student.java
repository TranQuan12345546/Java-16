package lab2;

import java.util.Scanner;

public class Student {
    public static int STUDENT_ID = 100;

    private final int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double avg;

    public Student() {
        this.id = STUDENT_ID;
        STUDENT_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = avg;
    }

    public double avg2(double scoreMath, double scoreChemistry, double scorePhysic) {
        return (scoreMath + scoreChemistry + scorePhysic) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    public void inputInfo(){
        System.out.println("Mời nhập tên học sinh: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập điểm môn toán: ");
        this.scoreMath = new Scanner(System.in).nextDouble();
    }

}
