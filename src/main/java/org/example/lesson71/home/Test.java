package org.example.lesson71.home;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("Tom");

        test(cat);
        test(new Cat("Vasia"));
    }
    private static void test(Pet cat){
        cat.fedd();
    }
}
