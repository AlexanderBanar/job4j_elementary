package test.java.tasks7;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tasks7.OptionalOfAndEmpty;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmptyTest {
    @Test
    public void whenExists() {
        Assert.assertEquals(
                Optional.of("c"),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNotExists() {
        Assert.assertEquals(
                Optional.empty(),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "d"
                )
        );
    }

}