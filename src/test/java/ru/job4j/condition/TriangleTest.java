package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        Assert.assertFalse(result);
    }
}