package phoigiongthucung;

import java.util.ArrayList;
import java.util.Scanner;


public class LogicHandle {
    ArrayList<Pet> pets = new ArrayList<>();
    public void inputDefaultPet() {
        Pet pet1 = new Pet("Tom", "Husky", 4, "Giống đực", "Cao, to, đen, hôi", Type.DOG, "abc");
        Pet pet2 = new Pet("Jerry", "Mèo Anh", 2, "Giống cái", "To, tròn", Type.CAT, "abc");
        Pet pet3 = new Pet("Bun", "Bec gie", 7, "Giống đực", "khoẻ mạnh", Type.DOG, "abc");
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
    }


    public Pet inputYourPet(View view, Pet pet, Scanner sc) {
        System.out.println("Nhập tên thú cưng: ");
        pet.setName(sc.nextLine());
        System.out.println("Nhập giống loài: ");
        pet.setSpecies(sc.nextLine());
        do {
            try {
                System.out.println("Nhập tuổi: ");
                pet.setAge(Integer.parseInt(sc.nextLine()));
                if (pet.getAge() <=0) {
                    System.out.println("Tuổi không thể nhỏ hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số tự nhiên.");
            }
        } while (pet.getAge() <= 0);
        int sex = view.sexView(sc);
        if (sex == 1) {
            pet.setSex("Giống đực");
        }
        if (sex == 2) {
            pet.setSex("Giống cái");
        }
        System.out.println("Nhập thông tin mô tả: ");
        pet.setDescription(sc.nextLine());
        int type = view.typeView(sc);
        if (type == 1) {
            pet.setTYPE(Type.DOG);
        }
        if (type == 2) {
            pet.setTYPE(Type.CAT);
        }
        System.out.println("Nhập hình ảnh: ");
        pet.setImage(sc.nextLine());
        return pet;
    }

    public void match(View view, Pet pet, Scanner sc) {
        for (Pet i : pets) {
            if ((i.getSex() != pet.getSex()) && (i.getTYPE() == pet.getTYPE())) {
                System.out.println("Tìm thấy 1 pet phù hợp để ghép đôi với pet của bạn");
                System.out.println(i);
            } else {
                continue;
            }
            int chose = view.petView(sc);
            if (chose == 2) {
                break;
            }
        }
        System.out.println("Không còn đối tượng phù hợp");
    }
}
