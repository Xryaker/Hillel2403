package org.example.lesson4;

public class ExamplE {
     public String name;
     public int age;
     public boolean live;
     public String sex;

     public ExamplE(){

     }

     public void printInfo(){
          System.out.println("Name = "+name+"\nAge = "+countDay()+"\nSEX = "+sex);
     }
     private int countDay(){
          return age*365;
     }
}
