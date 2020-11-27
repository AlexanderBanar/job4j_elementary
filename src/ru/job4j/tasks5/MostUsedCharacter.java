package ru.job4j.tasks5;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        str = str.replaceAll(" ", "");
        str = str.toLowerCase();
        Map<Character, Integer> temp = new TreeMap<>();
        int qty = 0;
        for (char n : str.toCharArray()) {
            temp.putIfAbsent(n, 1);
            temp.computeIfPresent(n, (key, value) -> value + 1);
            if (temp.get(n) > qty) {
                qty = temp.get(n);
                rsl = n;
            }
        }
        return rsl;
    }
}
