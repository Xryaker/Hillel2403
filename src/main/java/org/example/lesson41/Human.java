package org.example.lesson41;

public class Human {
    private String name;
    private int age;
    private boolean live;
    private String sex;

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isLive() {
        return live;
    }

    public String getSex() {
        return sex;
    }

    public Human() {
        this.name = "John";
        this.age = 30;
        this.sex = "non undefined";
        this.live = true;
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        setAge(age);
        this.sex = sex;
        this.live = true;
    }

    public Human(String name, int age, String sex, boolean live) {
        this.name = name;
        setAge(age);
        this.live = live;
        this.sex = sex;
    }

    public void printInfo() {
        System.out.println("Name = " + name + "\nAge = " + age + "\nSEX = " + sex + "\nIsLive = " + live);
    }

    private int countDay() {
        return age * 365;
    }
}
