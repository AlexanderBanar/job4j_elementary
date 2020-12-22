package ru.job4j.task9;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(x -> x.equals(""));
    }
}
