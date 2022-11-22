package lab2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StudentHandle studentHandle = new StudentHandle();
        ArrayList<Student> students = studentHandle.addInfo();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (Student i : students) {
            double avg = i.avg2(i.getScoreMath(), i.getScoreChemistry(), i.getScorePhysic());
            if (avg >= 8) {
                countA++;
            } else if (avg < 8 && avg >= 6.5) {
                countB++;
            } else {
               countC++;
            }
            System.out.println("Học viên: " + i.getName() + " - Điểm trung bình: " + avg + " - " + studentHandle.checkLevel(avg));
        }
        double a = (double) countA / students.size();
        System.out.println("Học sinh loại A chiếm: " + a*100 + "%");
        double b = (double) countB / students.size();
        System.out.println("Học sinh loại B chiếm: " + b*100 + "%");
        double c = (double) countC / students.size();
        System.out.println("Học sinh loại C chiếm: " + c*100 + "%");
    }


}
