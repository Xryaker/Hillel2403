package org.example.lesson42;

public class Mamal extends  Animal{
    boolean predator;
    String color;
    int speed;

    public Mamal(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public Mamal(String name, int age, boolean predator, String color, int speed) {
        super(name, age);
        this.predator = predator;
        this.color = color;
        this.speed = speed;
    }

    public Mamal(boolean predator, String color, int speed) {
        super("John",5);
        this.predator = predator;
        this.color = color;
        this.speed = speed;
    }
    public void move(){
        System.out.println("I can move");
    }
}
