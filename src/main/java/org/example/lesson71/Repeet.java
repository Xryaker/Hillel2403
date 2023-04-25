package org.example.lesson71;

public class Repeet {
    private static KeyBox[] keyBoxes;

    public static void main(String[] args) {
        set(1,"",new KeyBox(),new KeyBox());
    }
    private static void set(int i,String t,KeyBox... keyBosxes){
        keyBoxes=keyBosxes;
    }

}
