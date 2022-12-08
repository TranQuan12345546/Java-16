package secret.logichandle;

import secret.entity.CoupleQuesAns;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static secret.logichandle.QuesAnsLogic.checkNumberException;
import static secret.main.Main.coupleQuesAnsArrayList;

public class QuizzLogic {
    public void quizzLogic(Scanner sc) {
        System.out.println("Chào mừng bạn đến với Quizz Test.");
        System.out.println("Hãy suy nghĩ kỹ trước khi chọn đáp án!");
        do {
            String[] answers = new String[4];
            Random rd = new Random();
            int idQues = 0;
            String answer = null;
            boolean flag = true;
            while (flag) {
                idQues = rd.nextInt(coupleQuesAnsArrayList.size());
                for (CoupleQuesAns j : coupleQuesAnsArrayList) {
                    if (j.getId() == idQues) {
                        System.out.println("Câu hỏi: ");
                        System.out.println(j.getQuestion());
                        answer = j.getAnswer();
                        flag = false;
                    }
                }
            }
            answers[0] = answer;

            int idQues1 = 0;
            String answer1 = null;
            boolean flag1 = true;
            while (flag1) {
                idQues1 = rd.nextInt(coupleQuesAnsArrayList.size());
                if (idQues1 != idQues) {
                    for (CoupleQuesAns j : coupleQuesAnsArrayList) {
                        if (j.getId() == idQues1) {
                            answer1 = j.getAnswer();
                            flag1 = false;
                        }
                    }
                }
            }
            answers[1] = answer1;

            int idQues2 = 0;
            String answer2 = null;
            boolean flag2 = true;
            while (flag2) {
                idQues2 = rd.nextInt(coupleQuesAnsArrayList.size());
                if (idQues2 != idQues && idQues2 != idQues1) {
                    for (CoupleQuesAns j : coupleQuesAnsArrayList) {
                        if (j.getId() == idQues2) {
                            answer2 = j.getAnswer();
                            flag2 = false;
                        }
                    }
                }
            }
            answers[2] = answer2;

            int idQues3;
            String answer3 = null;
            boolean flag3 = true;
            while (flag3) {
                idQues3 = rd.nextInt(coupleQuesAnsArrayList.size());
                if (idQues3 != idQues && idQues3 != idQues1 && idQues3 != idQues2) {
                    for (CoupleQuesAns j : coupleQuesAnsArrayList) {
                        if (j.getId() == idQues3) {
                            answer3 = j.getAnswer();
                            flag3 = false;
                        }
                    }
                }
            }
            answers[3] = answer3;

            Collections.shuffle(Arrays.asList(answers));

            System.out.println("Chọn 1 trong các đáp án sau");
            System.out.println("1. " + answers[0]);
            System.out.println("2. " + answers[1]);
            System.out.println("3. " + answers[2]);
            System.out.println("4. " + answers[3]);
            System.out.println("Đáp án của bạn là: ");

            int choose = checkNumberException(sc, 1, 4);
            switch (choose) {
                case 1: checkCorrectAnswer(answers[0], answer);
                    break;
                case 2: checkCorrectAnswer(answers[1], answer);
                    break;
                case 3: checkCorrectAnswer(answers[2], answer);
                    break;
                case 4: checkCorrectAnswer(answers[3], answer);
                    break;
            }
        } while (true);
    }

    private void checkCorrectAnswer(String string, String answer) {
        if (string.equals(answer)) {
            String[] strings = {"Đáp án chính xác", "Tuyệt vời", "Bạn trả lời đúng rồi", "Làm tốt lắm"};
            Random rd = new Random();
            int num = rd.nextInt(4);
            System.out.println(strings[num]);
        } else {
            String[] strings = {"Đáp án không chính xác", "Ops, sai rồi :(", "Bạn trả lời sai rồi", "Ôn tập lại đi nhé!"};
            Random rd = new Random();
            int num = rd.nextInt(4);
            System.out.println(strings[num]);

        }
    }

}
