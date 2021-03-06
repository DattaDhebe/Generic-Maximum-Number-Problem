package com.generic_max_number;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void integerMaxNumber_AtFirst_Position() {
        MaxNumber<Integer> max = new MaxNumber<>(10, 4, 7, 2, 3);
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
        MaxNumber<Float> max = new MaxNumber<>(2.3f, 1.2f, 1.1f, 1.3f, 2.1f);
        Assert.assertEquals(2.3f, max.findMaxNumber(), 0.0f);
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

    @Test
    public void stringMaxString_AtFirst_Position() {
        MaxNumber<String> max = new MaxNumber<>( "Peach", "Apple", "Banana", "Fruit", "Hack");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

    @Test
    public void stringMaxString_AtSecond_Position() {
        MaxNumber<String> max = new MaxNumber<>("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

    @Test
    public void stringMaxString_AtThird_Position() {
        MaxNumber<String> max = new MaxNumber<>("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

}
