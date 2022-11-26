package secret.logichandle;

import secret.entity.CoupleQuesAns;

import java.util.Scanner;

import static secret.main.Main.coupleQuesAnsArrayList;

public class AnswerLogic {

    public void editAnswer(Scanner sc) {
        System.out.print("Nhập id câu trả lời muốn sửa: ");
        boolean flag = true;
        int idAns = 0;
        do {
            try {
                idAns = Integer.parseInt(sc.nextLine());
                for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                    if (i.getAnswer().getId() == idAns) {
                        System.out.print("Nhập nội dung sửa đổi: ");
                        String editAns = sc.nextLine();
                        i.getAnswer().setAnswer(editAns);
                        System.out.println("Đã sửa câu trả lời có id " + idAns + ". Đây là câu trả lời mới: ");
                        System.out.println(i.getAnswer());
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Không có câu trả lời nào có id " + idAns);
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
        } while (flag);
    }

}
