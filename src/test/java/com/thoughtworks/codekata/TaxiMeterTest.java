package com.thoughtworks.codekata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaxiMeterTest {

    @Test
    public void emptyTest() {
    }

    @Test
    public void should_be_8_yuan_given_0_km() {
        Yuan money = new TaxiMeter(new KM(0)).calculate();
        assertThat(money, is(new Yuan(8)));
    }

    @Test
    public void should_be_8_yuan_given_3_km() {
        Yuan money = new TaxiMeter(new KM(3)).calculate();
        assertThat(money, is(new Yuan(8)));
    }

    @Test
    public void should_be_12_yuan_given_5_km() {
//        Yuan money = new TaxiMeter(new KM(5)).calculate();
//        assertThat(money, is(new Yuan(12)));
    }
}
