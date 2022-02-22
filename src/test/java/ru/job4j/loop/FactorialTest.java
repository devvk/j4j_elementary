package ru.job4j.loop;

import org.junit.Test;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class FactorialTest {
    /**
     * Тест, проверяющий, что факториал для числа 5 равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));

    }

    /**
     * Тест, проверяющий, что факториал для числа 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }
}