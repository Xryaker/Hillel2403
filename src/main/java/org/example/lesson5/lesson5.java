package org.example.lesson5;

import org.example.lesson42.Animal;
import org.example.lesson42.Bird;
import org.example.lesson42.Mamal;
import org.example.lesson42.Tiger;

public class lesson5 {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("Tomy",5,true,"red",50,"Vasiliy");
        tiger.printName();
        Mamal mamal=new Mamal("Spyke",5,false,"green",12);
        mamal.printName();
        System.out.println(tiger);
        Bird bird=new Bird("Koly",5,true,"green");
        System.out.println(bird);
        printInfo(tiger);
        printInfo(bird);

    }

    public static  void printInfo(Animal animal){
        animal.printName();
    }
}
