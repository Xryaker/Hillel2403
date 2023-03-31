package org.example.lesson3;

public class CalcU {
    public static int calculate(int number,int number2,String symbol){
        int result=0;
        switch (symbol){
            case "+":
               result= sum(number,number2);
            break;
            case "-":
                result=minus(number,number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }

        return result;
    }

    private static int minus(int number, int number2) {
        return  number-number2;
    }

    private static int sum(int number, int number2) {
        return number+number2;
    }
}
