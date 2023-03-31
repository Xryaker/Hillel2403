package org.example.lesson3;

import org.example.lesson2.Lesson23;

import java.util.Random;

public class Lesson34 {
    public static void main(String[] args) {
       home2(20);
    }


    public static void home2(int i){
        int[] massive=createMassive(i);
        Lesson23.printMassive(massive);
        printPositiveAndChetnoeNumbers(massive);
        System.out.println(getSum(massive));
    }

    public static int[] createMassive(int i) {
        int[] mass =new int[i];
        Random random=new Random();
        for(int t=0;t<i;t++){
            mass[t]= random.nextInt(-10,70);
        }
        return mass;
    }

    public  static  void printPositiveAndChetnoeNumbers(int[] mass){
        System.out.println("");
        System.out.print("[ ");
        for (int l:mass){
            if(l%2==0&&l>=0){
                System.out.print(l+" ");
            }
        }
        System.out.print("]");
    }
    public  static  int getSum(int[] mass){
        System.out.println("");
        int sum=0;
        for(int l:mass){
            if (l>5&&l<45){
                sum=sum+l;
            }
        }
        return sum;
    }
}
