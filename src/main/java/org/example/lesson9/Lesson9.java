package org.example.lesson9;

public class Lesson9 {
    public static void main(String[] args) {
//        Wether.getWether(Season.valueOf("SPRING"));
//        for(Season s:Season.values()){
//            System.out.println(s.name());
//            System.out.println(s.ordinal());
//        }
        Season seas=Season.SPRING;
        seas.getSomeInfo(15);
        //System.out.println(Season.SPRING);
    }


}
