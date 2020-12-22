package test.java.tasks7;

import org.junit.Test;
import ru.job4j.tasks7.PredicateCheckEven;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }

}