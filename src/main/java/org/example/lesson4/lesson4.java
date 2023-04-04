package org.example.lesson4;

public class lesson4 {
    public static void main(String[] args) {
        ExamplE human = new ExamplE();
        human.age = 34;
        human.sex = "male";

        ExamplE human1 = new ExamplE();
        human1.name = "Igor";
        human1.age = 1096;
        human1.sex = "male";

        human.printInfo();
        human1.printInfo();

    }
}
