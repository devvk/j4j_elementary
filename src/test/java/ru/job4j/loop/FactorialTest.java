package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {
    /**
     * Тест, проверяющий, что факториал для числа 5 равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl).isEqualTo(expected);

    }

    /**
     * Тест, проверяющий, что факториал для числа 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }
}
