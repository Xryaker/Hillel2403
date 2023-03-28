package org.example.lesson2;

public class Lesson27 {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {5,6,4,5,7},
                {3,2,1},
                {7,8,9,8,78,56,12},
                {100}
        };
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

        }
    }
}
