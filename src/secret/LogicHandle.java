package secret;

import java.util.Scanner;

import static secret.Main.answers;

public class LogicHandle {
    public void showMenu() {
        System.out.println("-------PROGRAM JAVA INTERVIEW QUESTION--------");
        System.out.println("1. Thêm câu hỏi, câu trả lời.");
        System.out.println("2. Sửa câu hỏi, câu trả lời.");
        System.out.println("3. Tìm kiếm câu hỏi.");
        System.out.println("4. Sắp xếp câu hỏi.");
        System.out.println("5. Luyện tập");
        System.out.println("6. Quiz.");
        System.out.println("7. Thoát chương trình.");
        System.out.print("Chọn: ");
    }

    public void chooseMenu() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
        } while (choice < 1 || choice > 6);
        switch (choice) {
            case 1:
                addQuestion();
                break;
            case 2:
                editQuestion();
                break;
            case 3:
                findQuestion();
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                System.exit(0);
        }
    }

    private void findQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ khoá cần tìm: ");
        String findQues = sc.nextLine();
        boolean flag = true;
        for (Answer i : answers) {
            String term = i.getContent();
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

    private void addQuestion() {

        Answer answer = new Answer();
        answer.input();
        answers.add(answer);
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
                Answer answer1 = new Answer();
                answer1.input();
                answers.add(answer1);
            }
            if (choose == 2) {
                for (Answer i : answers) {
                    System.out.println(i);
                }
                break;
            }
        } while (true);
    }


    private void editQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn sửa câu hỏi hay câu trả lời: ");
        System.out.println("1. Câu hỏi.");
        System.out.println("2. Câu trả lời.");
        int choose = -1;
        do {
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
            if (choose < 1 || choose > 2) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        } while (choose < 1 || choose > 2);

        if (choose == 1) {
            System.out.print("Nhập id câu hỏi muốn sửa: ");
            boolean flag = true;
            int idQues = 0;
            do {
                try {
                    idQues = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số");
                }
                for (Answer i : answers) {
                    if (i.getId() == idQues) {
                        System.out.print("Nhập nội dung sửa đổi:");
                        String editQues = sc.nextLine();
                        i.setContent(editQues);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Không có câu hỏi nào có id " + idQues);
                }
            } while (flag);
        }

        if (choose == 2) {
            System.out.print("Nhập id câu trả lời muốn sửa: ");
            boolean flag = true;
            int idAns = 0;
            do {
                try {
                    idAns = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Bạn cần nhập vào 1 số");
                }
                for (Answer i : answers) {
                    if (i.getId() == idAns) {
                        System.out.print("Nhập nội dung sửa đổi:");
                        String editAns = sc.nextLine();
                        i.setAnswer(editAns);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Không có câu trả lời nào có id " + idAns);
                }
            } while (flag);
        }

        for (Answer i : answers) {
            System.out.println(i);
        }
    }



}
