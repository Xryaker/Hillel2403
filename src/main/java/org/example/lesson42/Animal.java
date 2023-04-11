package org.example.lesson42;

public  abstract class Animal {
    public int getAge() {
        return age;
    }

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
    public  abstract int getSumDays();

}
