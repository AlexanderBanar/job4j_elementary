package ru.job4j.tasks10;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream().sorted().dropWhile(x -> x < 0).collect(Collectors.toList());
    }
}
