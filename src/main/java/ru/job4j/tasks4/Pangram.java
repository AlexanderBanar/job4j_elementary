package ru.job4j.tasks4;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String temp = s.replaceAll("\\s", "").toLowerCase();
        Set<Character> rsl = new HashSet<>();
        for (int i = 0; i < temp.length(); i++) {
            rsl.add(temp.charAt(i));
        }
        return rsl.size() == 26;
    }
}
