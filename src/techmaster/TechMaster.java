package techmaster;

public class TechMaster {
    private Manager manager;
    private Lecture lecture;
    private ClassTech classTech;

    public TechMaster(Manager manager, Lecture lecture, ClassTech classTech) {
        this.manager = manager;
        this.lecture = lecture;
        this.classTech = classTech;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public ClassTech getClassTech() {
        return classTech;
    }

    public void setClassTech(ClassTech classTech) {
        this.classTech = classTech;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "manager=" + manager + "\n" +
                ", lecture=" + lecture + "\n" +
                ", classTech=" + classTech +
                '}';
    }

}
