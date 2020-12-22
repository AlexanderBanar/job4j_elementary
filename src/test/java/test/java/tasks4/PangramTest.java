package test.java.tasks4;

import org.junit.Test;
import ru.job4j.tasks4.Pangram;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }
}