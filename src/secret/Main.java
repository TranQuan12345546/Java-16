package secret;


import java.util.ArrayList;

public class Main {
    static ArrayList<CoupleQuesAns> coupleQuesAnsArrayList = new ArrayList<>();
    public static void main(String[] args) {
        LogicHandle logicHandle = new LogicHandle();
        while (true) {
            logicHandle.showMenu();
            logicHandle.chooseMenu();
        }
    }
}
