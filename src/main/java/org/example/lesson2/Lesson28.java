package org.example.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson28 {
    public static void main(String[] args) {
        Random random=new Random();
        int s=random.nextInt(5,10);
        int k=random.nextInt(5,10);
        int[][] mat=new int[s][k];
        System.out.println(mat.length);
        System.out.println(mat[mat.length-1].length);
        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=random.nextInt(-50,50);

            }

        }
        for(int i=0;i<mat.length;i++){
            System.out.println("");
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }

        }
    }
}
