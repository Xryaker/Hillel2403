package org.example.lesson2;

public class Lesson25 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 10) {
            System.out.print(i + " # ");
            i = i + 1;
        }

        do {
            System.out.print(i + " # ");
            i = i + 1;
        } while (i < 10);
    }
}
