package phoigiongthucung;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.Scanner;

public class Pet {
    public static int ID_PET = 100;

    private final int id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private Type TYPE;
    private String image;

    public Pet() {
        this.id = ID_PET;
        ID_PET++;
    }

    public Pet(String name, String species, int age, String sex, String description, Type TYPE, String image) {
        this.id = ID_PET++;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.TYPE = TYPE;
        this.image = image;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getTYPE() {
        return TYPE;
    }

    public void setTYPE(Type TYPE) {
        this.TYPE = TYPE;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", TYPE=" + TYPE +
                ", image='" + image + '\'' +
                '}';
    }

    public void input(Scanner sc) {
        System.out.println("Nhập tên thú cưng: ");
        this.name = sc.nextLine();
        System.out.println("Nhập giống loài: ");
        this.species = sc.nextLine();
        do {
            try {
                System.out.println("Nhập tuổi: ");
                this.age = Integer.parseInt(sc.nextLine());
                if (age <=0) {
                    System.out.println("Tuổi không thể nhỏ hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Bạn cần nhập vào 1 số tự nhiên.");
            }
        } while (age <= 0);
        System.out.println("Chọn giới tính");
        System.out.println("1. Giống đực");
        System.out.println("2. Giống cái");
        int sex = 0;
        do {
            try {
                sex = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần chọn 1 trong 2 phương án.");
            }
            if (sex < 1 || sex > 2) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } while (sex < 1 || sex > 2);
        if (sex == 1) {
            this.sex = "Giống đực";
        }
        if (sex == 2) {
            this.sex = "Giống cái";
        }
        System.out.println("Nhập thông tin mô tả: ");
        this.description = sc.nextLine();
        System.out.println("Chọn kiểu: ");
        System.out.println("1. DOG");
        System.out.println("2. CAT");
        int type = 0;
        do {
            try {
                type = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn cần chọn 1 trong 2 phương án.");
            }
            if (type < 1 || type > 2) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } while (type < 1 || type > 2);
        if (type == 1) {
            this.TYPE = Type.DOG;
        }
        if (type == 2) {
            this.TYPE = Type.CAT;
        }
        System.out.println("Nhập hình ảnh: ");
        this.image = sc.nextLine();

    }
}
