package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        BookHandle bookHandle = new BookHandle();
        Book book = bookHandle.inputBook(scanner);
        bookHandle.insertObj(book, books);
        books.forEach(System.out::println);
        Book book1 = bookHandle.updateBook(scanner);
        bookHandle.updateObj(book1, books);
        bookHandle.deleteObj(book, books);
        books.forEach(System.out::println);

        List<Reader> readers = new ArrayList<>();
        ReaderHandle readerHandle = new ReaderHandle();
        Reader reader = readerHandle.inputReader(scanner);
        readerHandle.insertObj(reader, readers);
        readers.forEach(System.out::println);
        Reader reader1 = readerHandle.updateReader(scanner);
        readerHandle.updateObj(reader1, readers);
        readerHandle.deleteObj(reader, readers);
        readers.forEach(System.out::println);
    }
}
