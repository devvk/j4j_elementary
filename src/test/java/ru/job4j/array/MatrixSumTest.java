package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] in = {
                {10}
        };
        int expected = 10;
        int result = MatrixSum.sum(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTwo() {
        int[][] in = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int result = MatrixSum.sum(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expected = 7;
        int result = MatrixSum.sum(in);
        assertThat(result).isEqualTo(expected);
    }
}
