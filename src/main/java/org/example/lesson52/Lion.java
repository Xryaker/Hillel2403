package org.example.lesson52;

public class Lion extends Predator{
    int age=10;
    @Override
    boolean isLife() {
        return false;
    }

    @Override
    String voice() {
        return null;
    }

    @Override
    void hunting() {

    }
}
