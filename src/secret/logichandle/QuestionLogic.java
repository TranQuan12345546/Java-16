package secret.logichandle;

import secret.entity.CoupleQuesAns;

import java.util.Scanner;

import static secret.main.Main.coupleQuesAnsArrayList;

public class QuestionLogic {
    public void editQuestion(Scanner sc) {
        System.out.print("Nhập id câu hỏi muốn sửa: ");
        boolean flag = true;
        int idQues = 0;
        do {
            try {
                idQues = Integer.parseInt(sc.nextLine());
                for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                    if (i.getQuestion().getId() == idQues) {
                        System.out.print("Nhập nội dung sửa đổi: ");
                        String editQues = sc.nextLine();
                        i.getQuestion().setContent(editQues);
                        System.out.println("Đã sửa câu hỏi có id " + idQues + ". Đây là câu hỏi mới: ");
                        System.out.println(i.getQuestion());
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Không có câu hỏi nào có id " + idQues);
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
        } while (flag);
    }

    public void findQuestion() {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn cần thêm câu hỏi, câu trả lời trước.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập từ khoá cần tìm: ");
            String findQues = sc.nextLine();
            boolean flag = true;
            for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                String term = i.getQuestion().getContent();
                if (term.contains(findQues)) {
                    System.out.println("Đây là câu hỏi bạn cần tìm: ");
                    System.out.println(i);
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Không tìm thấy câu hỏi có từ khoá " + findQues);
            }
        }
    }
}
