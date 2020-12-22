package ru.job4j.tasks7;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (var n : strings) {
            if (Objects.equals(Optional.ofNullable(n), Optional.ofNullable(value))) {
                return Optional.ofNullable(n);
            }
        }
        return Optional.empty();
    }
}
