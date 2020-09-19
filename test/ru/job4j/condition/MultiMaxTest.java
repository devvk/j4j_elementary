package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        assertThat(MultiMax.max(6, 4, 2), is(6));
        assertThat(MultiMax.max(1, 4, 2), is(4));
        assertThat(MultiMax.max(1, 4, 7), is(7));
        assertThat(MultiMax.max(3, 3, 3), is(3));
    }
}