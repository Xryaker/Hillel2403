package org.example.lesson42;

public class Animal {
    public String getName() {
        return name;
    }

    public Animal() {
    }

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printName(){
        System.out.println(this.name);
    }
}
