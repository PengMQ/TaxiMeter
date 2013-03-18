package com.thoughtworks.codekata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class YuanTest {

    @Test
    public void should_8_yuan_not_equals_10_yuan() {
        assertThat(new Yuan(8), is(not(new Yuan(10))));
    }
}
