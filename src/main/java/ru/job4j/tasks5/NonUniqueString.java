package ru.job4j.tasks5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Integer> temp = new HashMap<>();
        for (String n : strings) {
            if (temp.containsKey(n)) {
                temp.computeIfPresent(n, (key, value) -> value + 1);
            } else {
                temp.putIfAbsent(n, 1);
            }
        }
        Map<String, Boolean> rsl = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> it = temp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            boolean value = pair.getValue() > 1;
            rsl.put(pair.getKey(), value);
        }
        return rsl;
    }
}
