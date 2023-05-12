package org.example.lesson10;

import java.util.*;

public class Lesson102 {
    public static void main(String[] args) {
        String string = "milk, milk, beer, water";
        printUniqWord(string);
    }
    //print uniq words
    public static void printUniqWord(String string){
        Set<String> masSet = new TreeSet<>(Arrays.asList(noCharacter(string)));
        for (String l : masSet) {

            System.out.println(capitalize(l)+" "+l.length());
        }
    }
    //finding characters and replacing their
    private static String[] noCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '/') {
                str = str.replace(str.charAt(i), ' ');
            }
        }
        return str.toLowerCase().split(" ");
    }

    //capitalizing the first characters
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
