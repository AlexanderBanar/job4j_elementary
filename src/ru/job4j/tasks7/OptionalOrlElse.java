package ru.job4j.tasks7;

import java.util.Optional;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        Integer value = -1;
        return optional.orElse(value);
    }
}
