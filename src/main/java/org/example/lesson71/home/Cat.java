package org.example.lesson71.home;

public class Cat extends Animals implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Cat "+getName()+" says: Meow");
    }

    @Override
    public void fedd() {
        System.out.println("Feeding cat "+getName());
    }

    @Override
    public void walk() {

    }

    @Override
    public void play() {

    }
}
