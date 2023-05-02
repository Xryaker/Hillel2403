package org.example.lesson10;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        String string="vasiliy";
        System.out.println(string.substring(3));
        System.out.println(string);
        System.out.println(capitalize(string));
        String sentence = "Hello my dear friend!";
        String[] words = sentence.split("e");

        for (String l:words)
        {
            System.out.println(l);
        }
    }
    public static String capitalize(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}
