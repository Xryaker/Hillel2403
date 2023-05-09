package org.example.lesson10;

import java.util.*;

public class Lesson102 {
    public static void main(String[] args) {
        homeWork("milk, milk, water, beer");

    }
    public static void homeWork(String str){
        for (String string : new HashSet<>(Arrays.stream(str.replace(",","").replace(".","").split(" ")).toList())) {
            System.out.println(string.substring(0, 1).toUpperCase() + string.substring(1));
        }
    }
}
