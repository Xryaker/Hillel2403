package org.example.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson24 {
    public static void main(String[] args) {
        int length = 20;
        int[] mass = new int[length];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(mass));

        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] % 2 != 0) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("");

        for (int l : mass) {
            System.out.print(l + " + ");
            if (l>0&&l<10){
                break;
            }
        }
        System.out.println("");
        System.out.println(Arrays.toString(mass));

    }
}
