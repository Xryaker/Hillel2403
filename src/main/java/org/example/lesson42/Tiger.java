package org.example.lesson42;

import java.util.Objects;

public class Tiger extends Mamal {
    private String sex;

    public String getMasterName() {
        return masterName;
    }

    private String masterName;

    public Tiger(String color, int speed) {
        super(color, speed);
    }

    public Tiger(String name, int age, boolean predator, String color, int speed, String masterName) {
        super(name, age, predator, color, speed);
        this.masterName = masterName;
    }

    public Tiger() {
        this("gren", 140);
    }

    public void printInfo() {
        System.out.println("TigerInfo");
    }

    @Override
    public void printName() {
        System.out.println("I am a tiger, my name is "+getName());
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof Tiger tige)
               && (Objects.equals(this.getName(), tige.getName()))
                && (this.getAge()==tige.getAge())
                &&(this.color.equals(tige.color));
    }

}
