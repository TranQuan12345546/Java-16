package secret;

public class CoupleQuesAns implements Inputable{

    public static int ID_COUPLE = 100;
    private final int id;
    private Question question;
    private Answer answer;

    public CoupleQuesAns() {
        this.id = ID_COUPLE;
        ID_COUPLE++;
    }

    public int getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "CoupleQuesAns{" +
                "id=" + id +
                ", question=" + question +
                ", answer=" + answer +
                '}';
    }

    @Override
    public void input() {
        Question question = new Question();
        question.input();
        this.question = question;
        Answer answer = new Answer();
        answer.input();
        this.answer = answer;
    }


}
