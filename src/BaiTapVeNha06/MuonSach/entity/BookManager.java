package BaiTapVeNha06.MuonSach.entity;

public class BookManager {
    private Reader reader;
    private Book[] book;

    public BookManager() {
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "reader=" + reader +
                ", book=" + book +
                '}';
    }
}
