package test2.logichandle;

import test2.Service;
import test2.entity.Reader;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ReaderHandle implements Service<Reader> {
    @Override
    public void insertObj(Reader Obj, List<Reader> Objs) {

    }

    @Override
    public void deleteObj(Reader Obj, List<Reader> Objs) {

    }

    @Override
    public void updateObj(Reader Obj, List<Reader> Objs) {

    }

    public Reader inputReader(Scanner scanner) {
        System.out.println("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày - tháng - năm sinh: ");
        String publicDate = scanner.nextLine();
        return new Reader(id, name, LocalDate.parse(publicDate));
    }

    public Reader updateReader(Scanner scanner) {
        System.out.println("Mời bạn nhập id update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên update: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày - tháng - năm sinh update: ");
        String publicDate = scanner.nextLine();
        return new Reader(id, name, LocalDate.parse(publicDate));
    }
}
