package ru.job4j.task9;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream().mapToLong(x -> (int) x).sum();
    }
}
