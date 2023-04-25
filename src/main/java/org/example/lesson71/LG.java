package org.example.lesson71;

import java.util.List;

public interface LG {
    public default double getTemperature() {
        return 10.0;
    }
    void plus();
    void minus();
    boolean powerOn();
    boolean powerOff();
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";

}
