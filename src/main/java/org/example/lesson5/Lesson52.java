package org.example.lesson5;

import org.example.lesson42.Animal;
import org.example.lesson42.Bird;
import org.example.lesson42.Mamal;
import org.example.lesson42.Tiger;

public class Lesson52 {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("Tomy",5,true,"red",50,"Vasiliy");
        Mamal mamal=new Mamal("Spyke",5,false,"green",12);
        Bird bird=new Bird("Koly",5,true,"green");
        Animal[] massive=new Animal[]{tiger,mamal,bird};
        printAgeinDay(massive);
    }
    public static void printAgeinDay(Animal[] animal){
        for(Animal l:animal){
            System.out.println(l.getSumDays());
        }
    }
}
