package test.java.task9;

import org.junit.Test;
import ru.job4j.task9.DistinctForPrimitive;

import java.util.List;

import static org.junit.Assert.*;

public class DistinctForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[] {1, 2, 3, 1, 2, 3})
        );
    }

}