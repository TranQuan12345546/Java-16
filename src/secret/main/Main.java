package secret.main;


import secret.entity.CoupleQuesAns;
import secret.logichandle.AnswerLogic;
import secret.logichandle.QuesAnsLogic;
import secret.logichandle.QuestionLogic;
import secret.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<CoupleQuesAns> coupleQuesAnsArrayList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        View view = new View();
        QuestionLogic questionLogic = new QuestionLogic();
        AnswerLogic answerLogic = new AnswerLogic();
        QuesAnsLogic quesAnsLogic = new QuesAnsLogic();
        while (true) {
            view.showMenu();
            view.chooseMenu(quesAnsLogic, questionLogic, answerLogic);
        }
    }
}
