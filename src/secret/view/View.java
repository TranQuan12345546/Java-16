package secret.view;

import secret.entity.CoupleQuesAns;
import secret.logichandle.QuesAnsLogic;
import secret.logichandle.QuizzLogic;

import java.util.Scanner;

import static secret.logichandle.QuesAnsLogic.checkNumberException;

public class View {
    public void showMenu() {
        System.out.println("-------JAVA INTERVIEW QUESTION PROGRAM--------");
        System.out.println("1. Thêm câu hỏi, câu trả lời.");
        System.out.println("2. Hiển thị câu hỏi, câu trả lời đã có.");
        System.out.println("3. Sửa câu hỏi, câu trả lời.");
        System.out.println("4. Tìm kiếm câu hỏi.");
        System.out.println("5. Sắp xếp câu hỏi.");
        System.out.println("6. Luyện tập");
        System.out.println("7. Quiz.");
        System.out.println("8. Thoát chương trình.");
        System.out.print("Chọn: ");
    }
// comparable comparator generic
    Scanner sc = new Scanner(System.in);
    public void chooseMenu(QuesAnsLogic quesAnsLogic, CoupleQuesAns coupleQuesAns) {
        int choice = checkNumberException(sc, 1, 8);
        switch (choice) {
            case 1:
                quesAnsLogic.addQuesAns(sc, coupleQuesAns);
                break;
            case 2:
                quesAnsLogic.showCouple();
                break;
            case 3:
                quesAnsLogic.editQuesAns(sc);
                break;
            case 4:
                quesAnsLogic.findQuestion(sc);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                QuizzLogic quizzLogic = new QuizzLogic();
                quizzLogic.quizzLogic(sc);
                break;
            case 8:
                System.exit(0);
                break;
        }
    }

    public void viewTopic() {
        System.out.println("Chọn chủ đề: ");
        System.out.println("1. Java Core");
        System.out.println("2. OOP - Hướng đối tượng");
        System.out.println("3. Java Threads");
        System.out.println("4. Java Collections");
        System.out.println("5. Exception");
    }
}
