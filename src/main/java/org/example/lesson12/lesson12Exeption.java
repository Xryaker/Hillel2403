package org.example.lesson12;

import java.io.IOException;
import java.util.jar.JarException;
import java.util.zip.ZipException;

public class lesson12Exeption {

    public static void main(String[] args) {

        int n = 0;
        try {
            n = 2 / 0;
        } catch (ArithmeticException e) {
            n = 2 / 2;
        }

        try {
            exMethod();
        }catch (Exception e){
           e.printStackTrace();
        }
        System.out.println(n);

        System.out.println("end");


    }
    public static void exMethod() throws IOException {

        throw  new JarException("JarException");
    }

}
