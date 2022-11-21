package techmaster;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.inputInfo();
        Lecture lecture = new Lecture();
        lecture.inputInfo();
        ClassTech classTech = new ClassTech();
        classTech.inputClass();
        TechMaster techMaster = new TechMaster(manager, lecture, classTech);
        System.out.println(techMaster);
    }
}
