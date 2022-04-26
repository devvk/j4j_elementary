package ru.job4j.array;

import static ru.job4j.array.EqLast.check;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }
}
