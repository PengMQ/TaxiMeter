package com.thoughtworks.codekata;


import org.junit.Test;

import java.security.KeyManagementException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaxiMeterTest {

    @Test
    public void emptyTest() {
    }

    @Test
    public void should_be_8_yuan_given_0_km() {
        Money money = new TaxiMeter(new KM(0)).calculate();
        assertThat(money, is(new Money(8)));
    }

    @Test
    public void should_be_8_yuan_given_3_km(){
        Money money = new TaxiMeter(new KM(3)).calculate();
        assertThat(money, is(new Money(8)));
    }
}
