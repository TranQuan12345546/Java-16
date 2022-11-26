package phoigiongthucung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LogicHandle logicHandle = new LogicHandle();
        View view = new View();
        Pet pet = new Pet();
        logicHandle.inputDefaultPet();
        logicHandle.match(view, logicHandle.inputYourPet(view, pet, sc), sc);
    }
}
