package secret;

import java.util.Scanner;

public class Question implements Inputable{
    public static int ID_QUESTION = 100;

    protected final int id;
    protected String topic;
    protected String content;

    public Question() {
        this.id = ID_QUESTION;
        ID_QUESTION++;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chủ đề của câu hỏi: ");
        System.out.println("1. Java Core");
        System.out.println("2. OOP - Hướng đối tượng");
        System.out.println("3. Java Threads");
        System.out.println("4. Java Collections");
        System.out.println("5. Exception");
        int choice = 0;
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số");
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        } while (choice < 1 || choice > 5);
        switch (choice) {
            case 1:
                this.topic = TopicQuestion.JAVA_CORE.value;
                break;
            case 2:
                this.topic = TopicQuestion.OOP.value;
                break;
            case 3:
                this.topic = TopicQuestion.JAVA_THREADS.value;
                break;
            case 4:
                this.topic = TopicQuestion.JAVA_COLLECTIONS.value;
                break;
            case 5:
                this.topic = TopicQuestion.EXCEPTION.value;
                break;
        }
        System.out.println("Mời nhập nội dung câu hỏi: ");
        this.content = sc.nextLine();
    }
}
