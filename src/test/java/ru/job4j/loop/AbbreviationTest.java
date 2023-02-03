package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AbbreviationTest {
    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("NATO"));
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("CEO"));
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("UNO"));
    }
}