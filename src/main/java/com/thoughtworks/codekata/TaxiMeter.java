package com.thoughtworks.codekata;


public class TaxiMeter {
    public static final KM FLAG_FALL_KM = new KM(3);
    public static final Yuan FLAG_FALL_PRICE = new Yuan(8);
    private KM km;

    public TaxiMeter(KM km) {
        this.km = km;
    }

    public Yuan calculate() {
        return km.lessOrEqualThan(FLAG_FALL_KM) ?
                FLAG_FALL_PRICE :
                FLAG_FALL_PRICE.plus(extraPrice());
    }

    private Yuan extraPrice() {
        KM extraKM = km.minus(FLAG_FALL_KM);
        return extraKM.multiple(new Yuan(2));
    }
}
