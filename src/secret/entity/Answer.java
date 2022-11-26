package secret.entity;

import java.util.Scanner;

public class Answer implements Inputable {
    public static int ID_ANSWER = 100;

    private final int id;
    private String answer;

    public Answer() {
        this.id = ID_ANSWER;
        ID_ANSWER++;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void input() {
        System.out.println("Mời nhập nội dung câu trả lời: ");
        this.answer = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
