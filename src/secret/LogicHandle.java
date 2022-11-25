package secret;

import java.util.Scanner;

import static secret.Main.coupleQuesAnsArrayList;


public class LogicHandle {
    public void showMenu() {
        System.out.println("-------PROGRAM JAVA INTERVIEW QUESTION--------");
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
                showCouple();
                break;
            case 3:
                editQuestion();
                break;
            case 4:
                findQuestion();
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                System.exit(0);
        }
    }

    private void showCouple() {
        System.out.print(coupleQuesAnsArrayList.get(0));;
    }

    private void findQuestion() {
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

    private void addQuestion() {
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


    private void editQuestion() {
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

            if (choose == 2) {
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

    }



}
