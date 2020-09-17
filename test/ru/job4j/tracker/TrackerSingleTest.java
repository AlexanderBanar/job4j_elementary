package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerSingleTest {
    @Test
    public void single1() {
        assertThat(new TrackerSingle().single1(), is(new TrackerSingle().single1()));
    }

    @Test
    public void single2() {
        assertThat(new TrackerSingle().single2(), is(new TrackerSingle().single2()));
    }

    @Test
    public void single3() {
        assertThat(new TrackerSingle().single3(), is(new TrackerSingle().single3()));
    }

    @Test
    public void single4() {
        assertThat(new TrackerSingle().single4(), is(new TrackerSingle().single4()));
    }
}