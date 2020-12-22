package test.java.loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenFrThreeToEightThenEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}