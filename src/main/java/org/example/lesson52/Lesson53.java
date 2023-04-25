package org.example.lesson52;

public class Lesson53 {
    public static void main(String[] args) {
        Animals animal = new Lion();
       // Lion lemur2 = animal; // DOES NOT COMPILE
        Lion lemur3 = (Lion) animal;
        System.out.println(lemur3.age);
    }
}
