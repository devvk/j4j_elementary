package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWoman173Then72() {
        short in = 173;
        double expected = 72;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.5);
    }
}