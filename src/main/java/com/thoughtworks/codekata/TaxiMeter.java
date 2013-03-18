package com.thoughtworks.codekata;


public class TaxiMeter {
    private KM km;

    public TaxiMeter(KM km) {
        this.km = km;
    }

    public Yuan calculate() {
//        if(km <= new KM(3)){

            return new Yuan(8);
//        }
//        return new Yuan(12);
    }
}
