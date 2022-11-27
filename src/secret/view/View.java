package secret.view;

import secret.logichandle.AnswerLogic;
import secret.logichandle.QuesAnsLogic;
import secret.logichandle.QuestionLogic;

import java.util.Scanner;

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
    static Scanner sc = new Scanner(System.in);
    public void chooseMenu(QuesAnsLogic quesAnsLogic, QuestionLogic questionLogic, AnswerLogic answerLogic) {
        int choice = 0;
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
        } while (choice < 1 || choice > 8);
        switch (choice) {
            case 1:
                quesAnsLogic.addQuesAns();
                break;
            case 2:
                quesAnsLogic.showCouple();
                break;
            case 3:
                quesAnsLogic.editQuesAns(questionLogic, answerLogic);
                break;
            case 4:
                questionLogic.findQuestion();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
}
