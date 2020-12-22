package ru.job4j.tasks5;

import java.util.Iterator;
import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        Iterator<Map.Entry<Integer, String>> it = name.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            name.computeIfPresent(pair.getKey(), (key, value) -> value + " " + surname.get(pair.getKey()));
        }
        return name;
    }
}
