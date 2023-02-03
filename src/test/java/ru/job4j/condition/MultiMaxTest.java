package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        assertThat(MultiMax.max(6, 4, 2), is(6));
        assertThat(MultiMax.max(1, 4, 2), is(4));
        assertThat(MultiMax.max(1, 4, 7), is(7));
        assertThat(MultiMax.max(3, 3, 3), is(3));
    }
}