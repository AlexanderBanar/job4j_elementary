package ru.job4j.task9;

import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream().map(x -> x.concat(".java")).collect(Collectors.toList());
    }
}
