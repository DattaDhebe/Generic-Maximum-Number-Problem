package com.generic_max_number;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void integerMaxNumber_AtFirst_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(10, 4, 7);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }

    @Test
    public void integerMaxNumber_AtSecond_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(4, 10, 7);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }

    @Test
    public void integerMaxNumber_AtThird_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(4, 7, 10);
        Assert.assertEquals(10, max.findMaxNumber().intValue());
    }

    @Test
    public void floatMaxNumber_AtFirst_Position() {
        MaxNumber<Float> max = new MaxNumber<>(1.3f, 1.2f, 1.1f);
        Assert.assertEquals(1.3f, max.findMaxNumber(), 0.0f);
    }

    @Test
    public void floatMaxNumber_AtSecond_Position() {
        MaxNumber<Float> max = new MaxNumber<>(1.1f, 1.3f, 1.2f);
        Assert.assertEquals(1.3f, max.findMaxNumber(), 0.0f);
    }

    @Test
    public void floatMaxNumber_AtThird_Position() {
        MaxNumber<Float> max = new MaxNumber<>(1.1f, 1.2f, 1.3f);
        Assert.assertEquals(1.3f, max.findMaxNumber(), 0.0f);
    }

}
