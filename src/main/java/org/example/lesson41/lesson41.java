package org.example.lesson41;

public class lesson41 {
    public static void main(String[] args) {
        int i=34;
        Human human=new Human("Vasiliy",i,"male");
        human.printInfo();
        Human human1=new Human("Igor",12500,"male",true);
        human1.printInfo();
        Human human2=new Human();

        human2.setAge(2);
        human2.printInfo();

//        human.name="Nikolay";
        System.out.println("======");
        human.printInfo();
        System.out.println(human2.getName());

    }
}
