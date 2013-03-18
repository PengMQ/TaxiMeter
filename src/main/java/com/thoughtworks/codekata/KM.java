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

    public boolean lessOrEqualThan(KM km) {
        return this.compareTo(km) <= 0;
    }

    public KM minus(KM km) {
        return new KM(value - km.value);
    }

    public Yuan multiple(Yuan y) {
        return new Yuan(value * y.getValue());
    }
}
