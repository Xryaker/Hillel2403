package org.example.lesson10;

import java.util.*;

public class Lesson102 {
    public static void main(String[] args) {
        String[] strings=new String[]{"qwe","sdf","ert","ert"};
        Set<String> ss=new TreeSet<>(Arrays.asList(strings));
        ss.add("aqwe");



        List<String> stringList=new ArrayList<>(Arrays.asList(strings));
        stringList.add("ert");
        stringList.addAll(stringList.size()-1,ss);
        System.out.println("==== "+ stringList);

        Set<String> stringSet=new HashSet<>(stringList);
        stringSet.add("ert");
        stringSet.add("yui");
        System.out.println(stringSet);

        Set<String> ssss=new TreeSet<>(stringList);
        ssss.add("aqwe");
        System.out.println(ssss);

        List<String> listt=new ArrayList<>(ssss);
        System.out.println(listt);
    }
}
