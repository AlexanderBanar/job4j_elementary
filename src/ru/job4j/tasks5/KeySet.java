package ru.job4j.tasks5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        Set<Integer> set = map.keySet();
        for (Integer n : set) {
            System.out.println(n + " - " + map.get(n));
        }
    }
}
