package phoigiongthucung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pet> pets = new ArrayList<>();
    public static void main(String[] args) {

        Pet pet1 = new Pet("Tom", "Husky", 4, "Giống đực", "Cao, to, đen, hôi", Type.DOG, "abc");
        Pet pet2 = new Pet("Jerry", "Mèo Anh", 2, "Giống cái", "To, tròn", Type.CAT, "abc");
        Pet pet3 = new Pet("Bun", "Bec gie", 7, "Giống đực", "khoẻ mạnh", Type.DOG, "abc");
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        match();
    }

    public static void match() {
        Scanner sc = new Scanner(System.in);
        Pet pet4 = new Pet();
        pet4.input(sc);
        for (Pet i : pets) {
            if ((i.getSex() != pet4.getSex()) && (i.getTYPE() == pet4.getTYPE())) {
                System.out.println(i);
            } else {
                continue;
            }
            System.out.println("Bạn có muốn tìm chú pet khác không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int chose = 0;
            do {
                try {
                    chose = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Bạn cần chọn 1 trong 2 phương án.");
                }
                if (chose < 1 || chose > 2) {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            } while (chose < 1 || chose > 2);
            if (chose == 2) {
                break;
            }
        }
        System.out.println("Không còn đối tượng phù hợp");
    }
}
