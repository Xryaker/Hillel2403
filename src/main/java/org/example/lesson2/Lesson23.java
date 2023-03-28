package org.example.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson23 {
    public static void main(String[] args) {
        int length=20;
        int[] mass = new int[length];
        Random random=new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(100);
        }
        String massive=Arrays.toString(mass);
        System.out.println(massive);

        System.out.println("length massive = " + mass.length);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + 1 + " element = " + mass[i]);
        }

        System.out.println("");
        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] % 2 == 0) {
                System.out.println(i + 1 + " element = " + mass[i]);
            }
        }


    }
}
