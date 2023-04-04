package org.example.lesson42;

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
    public Tiger(){
        this("gren",140);
    }
    public void printInfo(){
        System.out.println("TigerInfo");
    }
}
