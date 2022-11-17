package Interface;

public class New implements Inew{
    private String title;
    private String author;
    private String publicDate;
    private double rate;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("publicDate = " + publicDate);
        System.out.println("rate = " + rate);
    }
}
