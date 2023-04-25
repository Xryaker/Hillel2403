package org.example.lesson71;

public class KeyBox implements LG,SUMSUNG{
    @Override
    public double getTemperature() {
        return LG.super.getTemperature();
    }

    @Override
    public void plus() {

    }

    @Override
    public void minus() {

    }

    @Override
    public boolean powerOn() {
        return false;
    }

    @Override
    public boolean powerOff() {
        return false;
    }

    @Override
    public void sumsungMethod() {

    }
}
