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
}
