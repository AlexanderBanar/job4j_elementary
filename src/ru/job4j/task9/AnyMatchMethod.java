package ru.job4j.task9;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream().anyMatch(x -> x.startsWith("job4j"));
    }
}
