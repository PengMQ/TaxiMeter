package com.thoughtworks.codekata;


public class KM implements Comparable<KM> {
    private float value;

    public KM(float value) {
        this.value = value;
    }

    @Override
    public int compareTo(KM km) {
        return value < km.value ? -1 :
                value > km.value ? 1 : 0;
    }
}
