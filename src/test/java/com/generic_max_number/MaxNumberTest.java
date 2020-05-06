package com.generic_max_number;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void maxAt_First_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(10, 4, 7);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }

    @Test
    public void maxAt_Second_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(4, 10, 7);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }

    @Test
    public void maxAt_Third_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(4, 7, 10);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }
}
