package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[]{5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
