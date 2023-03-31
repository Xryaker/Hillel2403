package org.example.lesson3;

public class StringUt {
    private static String concat(String str1,String st2,String str3){
        return str1+st2+str3;
    }
    public static void print(String st, String nam) {
        System.out.println(nam + " " + st);
    }

    public static void print1() {
        System.out.println("Hello");
    }

    public static int stringInfo(String st) {

        return stinfo(st);
    }
    private static int stinfo(String str){
        return str.length();
    }
}
