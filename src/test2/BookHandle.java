package test2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BookHandle implements Service<Book>{
    @Override
    public void insertObj(Book Obj, List<Book> Objs) {
        Objs.add(Obj);
    }

    @Override
    public void deleteObj(Book Obj, List<Book> Objs) {
        for (Book b : Objs) {
            if (b.getId() == Obj.getId()) {
                b.setName(Obj.getName());
                b.setAuthor(Obj.getAuthor());
                b.setPublicDate(Obj.getPublicDate());
                break;
            }
        }
    }

    @Override
    public void updateObj(Book Obj, List<Book> Objs) {
        for (Book b : Objs) {
            if (b.getId() == Obj.getId()) {
                Objs.remove(b);
                break;
            }
        }
    }

    public Book inputBook(Scanner scanner) {
        System.out.println("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tên tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày xuất bản: ");
        String publicDate = scanner.nextLine();
        return new Book(id, name, author, LocalDate.parse(publicDate));
    }

    public Book updateBook(Scanner scanner) {
        System.out.println("Mời bạn nhập id update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên update: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập tên tác giả update: ");
        String author = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày xuất bản update: ");
        String publicDate = scanner.nextLine();
        return new Book(id, name, author, LocalDate.parse(publicDate));
    }
}
