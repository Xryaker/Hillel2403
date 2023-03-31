package org.example.lesson3;

public class Lesson31 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("Vvva",2, 5, 6, 6, 5, 5, 56, 5, 5, 2, 5, 5));
    }

    static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }
    static int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    static  int sumNumbers(String in,int... numbers){
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }
}
