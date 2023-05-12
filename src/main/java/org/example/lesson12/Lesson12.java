package org.example.lesson12;

import java.util.*;

public class Lesson12 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1235,"Vasiliy");
        map.put(-145,"Nikolay");
        map.put(25,"Olga");
        map.put(2,"====");
        printSortedMap(map);


    }

    public static void printSortMAp(Map<Integer, String> map) {
        Map<Integer, String> newMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> l : newMap.entrySet()) {
            System.out.println(l.getKey() + " = " + l.getValue());
        }
    }

    public static void printSortedMap(Map<Integer, String> map) {
        Set<Integer> integerSet = new TreeSet<>(map.keySet());
        for (Integer integer : integerSet) {
            System.out.println(integer + " = " + map.get(integer));
        }
    }
}

