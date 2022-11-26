package secret.logichandle;

import secret.entity.CoupleQuesAns;

import java.util.Scanner;

import static secret.main.Main.coupleQuesAnsArrayList;


public class QuesAnsLogic {


    public void showCouple() {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn chưa thêm câu hỏi, câu trả lời nào.");
        } else {
            System.out.print(coupleQuesAnsArrayList);
        }

    }


    public void addQuesAns() {
        CoupleQuesAns coupleQuesAns = new CoupleQuesAns();
        coupleQuesAns.input();
        coupleQuesAnsArrayList.add(coupleQuesAns);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn có muốn thêm câu hỏi tiếp theo không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choose;
            do {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                } catch (Exception e ) {
                    System.out.println("Bạn cần chọn 1 trong 2 phương án");
                    continue;
                }
                if (choose == 1 || choose == 2) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            } while (true);
            if (choose == 1) {
                CoupleQuesAns coupleQuesAns1 = new CoupleQuesAns();
                coupleQuesAns1.input();
                coupleQuesAnsArrayList.add(coupleQuesAns1);
            }
            if (choose == 2) {
                for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                    System.out.println(i);
                }
                break;
            }
        } while (true);
    }


    public void editQuesAns(QuestionLogic questionLogic, AnswerLogic answerLogic) {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn cần thêm câu hỏi, câu trả lời trước.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bạn muốn sửa câu hỏi hay câu trả lời: ");
            System.out.println("1. Câu hỏi.");
            System.out.println("2. Câu trả lời.");
            int choose = -1;
            do {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 1 || choose > 2) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    }
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số");
                }
            } while (choose < 1 || choose > 2);

            if (choose == 1) {
                questionLogic.editQuestion(sc);
            }

            if (choose == 2) {
                answerLogic.editAnswer(sc);
            }
        }

    }



}
