package org.example.lesson42;

public class lesson42 {
    public static void main(String[] args) {
//        Animal animal=new Animal("Sharik",5);
//        animal.printName();
        Bird bird=new Bird("Villy",5,false,"green");
        bird.printName();
        bird.fly();
        Mamal mamal = new Mamal(true, "red", 50);
        mamal.printName();
        Tiger tiger=new Tiger("Tiger",6,true,"red",70,"Igor");
        System.out.println(tiger.getMasterName());
        Animal animal=new Tiger();

    }

}
