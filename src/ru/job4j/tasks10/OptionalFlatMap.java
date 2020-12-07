package ru.job4j.tasks10;

import java.util.List;
import java.util.Optional;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(x -> x.endsWith(".java"))
                .findFirst()
                .flatMap(x -> Optional.of(x.length()));
    }
}
