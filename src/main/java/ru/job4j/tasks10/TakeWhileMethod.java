package ru.job4j.tasks10;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream().sorted().takeWhile(x -> x < 0).collect(Collectors.toList());
    }
}