package org.example.lesson9;

public enum Season {
    WINTER("snowing", 5,true),
    SPRING("raining", 6,false),
    SUMMER("sunny", 7,true),
    FALL("cloudy", 9);
    private String sinoptis;
    private int t;
    private boolean bool;

    Season(String sinoptis, int i) {
        this.sinoptis = sinoptis;
        this.t=i;
    }

    @Override
    public String toString() {
        return "In "+this.name()+" is "+sinoptis;
    }

    Season(String sinoptis, int i,boolean b) {
        this.sinoptis = sinoptis;
        this.t=i;
        this.bool=b;
    }


    public String getSinoptis() {
        return sinoptis;
    }

    public int getT() {
        return t;
    }









    public void getSomeInfo(int hi){
        System.out.println(hi * t + someMethod());
    }

    private int someMethod() {
        return sinoptis.length();
    }


}
