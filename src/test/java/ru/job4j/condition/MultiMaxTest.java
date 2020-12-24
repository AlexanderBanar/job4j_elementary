package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(15, 2, 10);
        assertThat(result, is(15));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(6, 7, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(8, 8, 8);
        assertThat(result, is(8));
    }
}