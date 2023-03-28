package org.example.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int[] massive=new int[10];
        int i=3;
        char symbol;
        massive[3]=98;
        System.out.println("#"+i+" "+massive[i]);
        double[] numbers2 = new double[] {1.0, 1.5, 3.6};
        char[] symbols = {'a', 'b', 'c', 'd'};
        String[] words = {"hello", "my", "friend"};
        boolean[] values = {true, false, false, true};
        System.out.println(symbols[2]);
        symbols[2]='f';
        System.out.println(symbols[2]);
        symbol=symbols[2];



        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]);
        int[][] matrix=new int[][]{
                {5,6,4},
                {3,2,1},
                {7,8,9,8,78,56,12}
        };
        System.out.println("=======matrix start======");
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][2]);
        System.out.println("matrix length "+matrix.length);
        System.out.println("length massive into massive "+matrix[2].length);
        int t=matrix[matrix.length - 1].length - 1;
        System.out.println(matrix[matrix.length - 1][t]);


    }
}
