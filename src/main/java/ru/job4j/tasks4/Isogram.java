package ru.job4j.tasks4;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<Character> rsl = new HashSet<>();
        for (Character n : s.toCharArray()) {
            rsl.add(n);
        }
        return s.length() == rsl.size();
    }
}
