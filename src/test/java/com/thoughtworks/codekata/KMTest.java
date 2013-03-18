package com.thoughtworks.codekata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class KMTest {

    @Test
    public void should_1_KM_short_than_2_KM() {
        assertThat(new KM(1).compareTo(new KM(2)), is(-1));
    }

    @Test
    public void should_2_KM_long_than_1_KM() {
        assertThat(new KM(2).compareTo(new KM(1)), is(1));
    }

    @Test
    public void should_1_KM_equals_1_KM() {
        assertThat(new KM(1).compareTo(new KM(1)), is(0));
    }
}
