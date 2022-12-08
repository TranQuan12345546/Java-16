package test;



import java.util.Random;

public class Rectangle {
    public static void main(String[] args) {
        Random rd = new Random();
        int iNewNumber = 0, iPrevious = -1;
        for (int i = 0; i < 10; ) {
            iNewNumber = rd.nextInt(100);
            if (iNewNumber != iPrevious){
                i++;
                iPrevious = iNewNumber;
                System.out.println("Item " + i + ":" + iNewNumber);
            }
        }
    }
}
