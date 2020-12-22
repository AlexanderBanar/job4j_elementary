package ru.job4j.tasks7;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String n : strings) {
            if (n.equals(value)) {
                Optional<String> optional = Optional.of(n);
                return optional;
            }
        }
        Optional<String> rsl = Optional.empty();
        return rsl;
    }
}
