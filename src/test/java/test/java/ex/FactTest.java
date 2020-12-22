package test.java.ex;

import org.junit.Test;
import ru.job4j.ex.Fact;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessZero() {
        Fact fact = new Fact();
        fact.calc(-5);
    }
}