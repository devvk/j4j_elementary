package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SwitchWeekTest {

    @Test
    public void whenDay1() {
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDay7() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }
}
