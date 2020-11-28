package ru.job4j.tasks5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        s = s.replaceAll(" ", "");
        List<Integer> replace = new ArrayList<>();
        for (Character n : s.toCharArray()) {
            if (rsl.containsKey(n)) {
                    replace = rsl.get(n);
                    replace.add(s.indexOf(n, replace.get(replace.size() - 1) + 1));
                    List<Integer> mirror = replace;
                    rsl.computeIfPresent(n, (key, value) -> mirror);
            } else {
                    List<Integer> init = new ArrayList<>();
                    init.add(s.indexOf(n));
                    rsl.putIfAbsent(n, init);
            }

        }
        return rsl;
    }
}
