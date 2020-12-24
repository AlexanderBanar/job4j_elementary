package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMax() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax() {
        int result = Max.max(4, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenBothEqual() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void maxOfThree() {
        int rsl = Max.max(0, 2, 6);
        assertThat(rsl, is(6));
    }

    @Test
    public void maxOfFour() {
        int rsl = Max.max(5, 25, 7, 4);
        assertThat(rsl, is(25));
    }
}