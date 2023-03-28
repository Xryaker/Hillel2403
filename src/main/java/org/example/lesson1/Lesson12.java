package org.example.lesson1;

public class Lesson12 {
    public static void main(String[] args) {
        int a;
        a = 2 * 5 + 3 * 4 - 8;
        int b = 2 * ((5 + 3) * 4 - 8);
        int d = 9 / 2;
        int c = a + b - d;
        int m = 10 % 3;
        System.out.println(m);
        boolean isActive = true;
        boolean state = !isActive;
        System.out.println(state);
        boolean graterOrEquals = d >= 3;
        System.out.println("graterOr..= " + graterOrEquals);
        boolean equals = a == c;
        System.out.println("equals " + equals);
        boolean compare = isActive && state || equals;
        System.out.println(compare);
        int q = d >= 3 ? 5 : 6;
        String str = d >= 3 ? "Vasiliy" : "Ivan";

    }
}
