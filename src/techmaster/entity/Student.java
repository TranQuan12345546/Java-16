package techmaster.entity;

import java.util.Scanner;

public class Student extends Person {

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhập học lực của học viên");
        this.level = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                '}';
    }
}
