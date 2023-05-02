package org.example.lesson10;

import java.util.ArrayList;

public class Lesson101 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("hawk");
//        list.add(true);
//        System.out.println(list); // [hawk, true]
//        for (Object l:list){
//            if(l instanceof String str){
//                System.out.println(str.toUpperCase());
//            }
//        }


        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        safer.add("true");
        System.out.println(safer.size());



        safer.add(String.valueOf(true));
        System.out.println(safer.size());
        System.out.println("="+safer.remove("true"));
        System.out.println("-"+safer.remove(0));


        System.out.println(safer);

        for(String l:safer){
            System.out.println(l);
        }

    }
}
