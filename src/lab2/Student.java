package lab2;

import java.util.Scanner;

public class Student {
    public static int STUDENT_ID = 100;

    private final int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

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



    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên học sinh: ");
        this.name = sc.nextLine();
        do {
            try {
                System.out.println("Nhập điểm môn Toán: ");
                this.scoreMath = Double.parseDouble(sc.nextLine());
                if (scoreMath <= 0 || scoreMath > 10) {
                    System.out.println("Điểm không thể nhỏ hơn 0 hoặc lớn hơn 10");
                }
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập vào 1 số tự nhiên");
            }
        } while (scoreMath <= 0 || scoreMath > 10);

        do {
            try {
                System.out.println("Nhập điểm môn Lý: ");
                this.scorePhysic = Double.parseDouble(sc.nextLine());
                if (scorePhysic <= 0 || scorePhysic > 10) {
                    System.out.println("Điểm không thể nhỏ hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập vào 1 số tự nhiên");
            }
        } while (scorePhysic <= 0 || scorePhysic > 10);

        do {
            try {
                System.out.println("Nhập điểm môn Hoá: ");
                this.scoreChemistry = Double.parseDouble(sc.nextLine());
                if (scoreChemistry <= 0 || scoreChemistry > 10) {
                    System.out.println("Điểm không thể nhỏ hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập vào 1 số tự nhiên");
            }
        } while (scoreChemistry <= 0 || scoreChemistry > 10);
    }

    public double avg2(double scoreMath, double scoreChemistry, double scorePhysic) {
        return (scoreMath + scoreChemistry + scorePhysic) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }
}
