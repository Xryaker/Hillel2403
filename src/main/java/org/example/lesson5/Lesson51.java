package org.example.lesson5;

import org.example.lesson42.Tiger;

public class Lesson51 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tomy", 5, true, "red", 50, "Vasiliy");
        Tiger tiger2 = new Tiger("Tomy", 5, true, "red", 50, "Vasiliy");
        System.out.println(tiger==tiger2);
        System.out.println(tiger.equals(tiger2));
    }
}
