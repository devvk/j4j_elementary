package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenDay1() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDay7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
