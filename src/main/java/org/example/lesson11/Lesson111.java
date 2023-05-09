package org.example.lesson11;

import org.example.lesson41.Human;

import java.util.HashMap;
import java.util.Map;

public class Lesson111 {
    public static void main(String[] args) {
        Map<Integer,Human> humans=new HashMap<>();
        humans.put(123654,new Human("Vasiliy",34,"male"));
        humans.put(145698,new Human());
        printInfo(humans);
        printHumanInfo(humans.get(123654));

    }
    public static void printInfo(Map<Integer,Human> humanMap){
        for(Map.Entry<Integer,Human> l:humanMap.entrySet()){
            System.out.println(l.getValue().getName() + " = " + l.getValue().getAge());
        }
    }
    public static void printHumanInfo(Human human){
        human.printInfo();
    }
}
