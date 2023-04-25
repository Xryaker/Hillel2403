package org.example.lesson71;

public interface MegaPult extends LG,SUMSUNG {
    void youtube();
    void netflix();
    void voiceSearch(String str);
    void tt();

    @Override
    default double getTemperature() {
        return SUMSUNG.super.getTemperature();
    }
}
