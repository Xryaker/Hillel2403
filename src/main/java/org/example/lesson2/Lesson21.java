package org.example.lesson2;

public class Lesson21 {
    public static void main(String[] args) {
        String str;
        int h = 5;
        if (h < 12) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good Afternoon");
        }

        boolean b = true;
        if (b) {
            str = "Good morning";
        } else {
            str = "Good Afternoon";
        }
        System.out.println(str);

        str = h < 12 ? "Good morning" : "Good Afternoon";
        System.out.println(str);
    }
}
