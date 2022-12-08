package secret.logichandle;

import secret.constant.TopicQuestion;
import secret.entity.CoupleQuesAns;

import java.util.Scanner;

import static secret.main.Main.coupleQuesAnsArrayList;
import static secret.main.Main.view;


public class QuesAnsLogic {

    public static int checkNumberException(Scanner sc, int firstNumber, int lastNumber) {
        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < firstNumber || choice > lastNumber) {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                }
            } catch (Exception e ) {
                System.out.println("Bạn cần nhập vào 1 số.");
            }
        } while (choice < firstNumber || choice > lastNumber);
        return choice;
    }



    public void showCouple() {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn chưa thêm câu hỏi, câu trả lời nào.");
        } else {
            System.out.println(coupleQuesAnsArrayList);
        }

    }

    public void inputQuesAns(Scanner sc, CoupleQuesAns coupleQuesAns) {
        view.viewTopic();
        int choice = checkNumberException(sc, 1, 5);
        switch (choice) {
            case 1:
                coupleQuesAns.setTopic(TopicQuestion.JAVA_CORE.value);
                break;
            case 2:
                coupleQuesAns.setTopic(TopicQuestion.OOP.value);
                break;
            case 3:
                coupleQuesAns.setTopic(TopicQuestion.JAVA_THREADS.value);
                break;
            case 4:
                coupleQuesAns.setTopic(TopicQuestion.JAVA_COLLECTIONS.value);
                break;
            case 5:
                coupleQuesAns.setTopic(TopicQuestion.EXCEPTION.value);
                break;
        }
        System.out.println("Mời nhập nội dung câu hỏi: ");
        coupleQuesAns.setQuestion(sc.nextLine());
        System.out.println("Mời nhập nội dung câu trả lời: ");
        coupleQuesAns.setAnswer(sc.nextLine());
    }

    public void addQuesAns(Scanner sc, CoupleQuesAns coupleQuesAns) {
        inputQuesAns(sc, coupleQuesAns);
        coupleQuesAnsArrayList.add(coupleQuesAns);
        do {
            System.out.println("Bạn có muốn thêm câu hỏi tiếp theo không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choose = checkNumberException(sc, 1, 2);
            if (choose == 1) {
                CoupleQuesAns coupleQuesAns1 = new CoupleQuesAns();
                inputQuesAns(sc, coupleQuesAns1);
                coupleQuesAnsArrayList.add(coupleQuesAns1);
            }
            if (choose == 2) {
                break;
            }
        } while (true);
    }

    public void editQuesAns(Scanner sc) {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn cần thêm câu hỏi, câu trả lời trước.");
        } else {
            System.out.println("Bạn muốn sửa câu hỏi hay câu trả lời: ");
            System.out.println("1. Câu hỏi.");
            System.out.println("2. Câu trả lời.");
            int choose = checkNumberException(sc , 1, 2);
            if (choose == 1) {
                editQuestion(sc);
            }

            if (choose == 2) {
                editAnswer(sc);
            }
        }
    }

    public void editQuestion(Scanner sc) {
        System.out.print("Nhập id câu hỏi muốn sửa: ");
        boolean flag = true;
        int idQues;
        do {
            try {
                idQues = Integer.parseInt(sc.nextLine());
                for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                    if (i.getId() == idQues) {
                        System.out.print("Nhập nội dung sửa đổi: ");
                        String editQues = sc.nextLine();
                        i.setQuestion(editQues);
                        System.out.println("Đã sửa câu hỏi có id " + idQues);
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

    public void editAnswer(Scanner sc) {
        System.out.print("Nhập id câu trả lời muốn sửa: ");
        boolean flag = true;
        int idAns;
        do {
            try {
                idAns = Integer.parseInt(sc.nextLine());
                for (CoupleQuesAns i : coupleQuesAnsArrayList) {
                    if (i.getId() == idAns) {
                        System.out.print("Nhập nội dung sửa đổi: ");
                        String editAns = sc.nextLine();
                        i.setAnswer(editAns);
                        System.out.println("Đã sửa câu trả lời có id " + idAns);
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

    public void findQuestion(Scanner sc) {
        if (coupleQuesAnsArrayList.size() == 0) {
            System.out.println("Bạn cần thêm câu hỏi, câu trả lời trước.");
        } else {
            System.out.println("1. Tìm kiếm theo từ khoá");
            System.out.println("2. Tìm kiếm theo chủ đề");
            int choice = checkNumberException(sc, 1, 2);
            if (choice == 1) {
                findQuestionByKey(sc);
            }
            if (choice == 2) {
                findQuestionByTopic(sc);
            }

        }
    }

    private void findQuestionByTopic(Scanner sc) {
        view.viewTopic();
        int choose = checkNumberException(sc, 1, 5);
        switch (choose) {
            case 1:
                findTopic(TopicQuestion.JAVA_CORE.value);
                break;
            case 2:
                findTopic(TopicQuestion.OOP.value);
                break;
            case 3:
                findTopic(TopicQuestion.JAVA_THREADS.value);
                break;
            case 4:
                findTopic(TopicQuestion.JAVA_COLLECTIONS.value);
                break;
            case 5:
                findTopic(TopicQuestion.EXCEPTION.value);
                break;
        }
    }

    private void findTopic(String string) {
        System.out.println("Đây là những câu hỏi có chủ đề " + string);
        for (CoupleQuesAns i : coupleQuesAnsArrayList) {
            if (i.getTopic().equals(string)){
                System.out.println(i);
            }
        }
    }

    private void findQuestionByKey(Scanner sc) {
        System.out.println("Nhập từ khoá cần tìm: ");
        String findQues = sc.nextLine();
        boolean flag = true;
        for (CoupleQuesAns i : coupleQuesAnsArrayList) {
            String term = i.getQuestion();
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

    public void addDefaultQues() {
        CoupleQuesAns coupleQuesAns1 = new CoupleQuesAns("qưeqrqrqrr1", "qưeqeqwe", "acb");
        CoupleQuesAns coupleQuesAns2 = new CoupleQuesAns("qưeqqưeqweqasdc2", "qưeqeqwe", "aog");
        CoupleQuesAns coupleQuesAns3 = new CoupleQuesAns("qưeqerr3", "qưeqeqwe", "gegr");
        CoupleQuesAns coupleQuesAns4 = new CoupleQuesAns("qưeqưeqwqrqrrr4", "qưeqeqwe", "rgbbcvb");
        CoupleQuesAns coupleQuesAns5 = new CoupleQuesAns("qưeqưeqwqrqrrr5", "qưeqeqwe", "rhhđj");
        CoupleQuesAns coupleQuesAns6 = new CoupleQuesAns("qưeqưeqwqrqrrr6", "qưeqeqwe", "qưeâccawggrhr");
        coupleQuesAnsArrayList.add(coupleQuesAns1);
        coupleQuesAnsArrayList.add(coupleQuesAns2);
        coupleQuesAnsArrayList.add(coupleQuesAns3);
        coupleQuesAnsArrayList.add(coupleQuesAns4);
        coupleQuesAnsArrayList.add(coupleQuesAns5);
        coupleQuesAnsArrayList.add(coupleQuesAns6);
    }



}
