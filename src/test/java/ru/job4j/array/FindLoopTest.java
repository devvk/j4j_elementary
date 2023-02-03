package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(data, value);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, value, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 10;
        int result = FindLoop.indexOf(data, value);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
