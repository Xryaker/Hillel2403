package org.example.lesson71;

public interface SUMSUNG {
    public default double getTemperature() {
        return 10.0;
    }
    boolean powerOff();
    void sumsungMethod();
}
