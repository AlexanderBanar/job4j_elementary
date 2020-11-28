package ru.job4j.tasks5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String n : strings) {
            String start = String.valueOf(n.charAt(0));
            if (rsl.containsKey(start)) {
                List<String> replace = rsl.get(start);
                replace.add(n);
                rsl.computeIfPresent(start, (key, value) -> replace);
            } else {
                List<String> init = new ArrayList<>();
                init.add(n);
                rsl.put(start, init);
            }
        }
        return rsl;
    }
}
