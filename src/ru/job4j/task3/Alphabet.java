package ru.job4j.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> temp = new ArrayList<>();
        char[] array = s.toCharArray();
        for (char n : array) {
            temp.add(Character.toString(n));
        }
        Comparator<String> comp = String::compareTo;
        StringBuilder rsl = new StringBuilder();
        temp.sort(comp);
        for (String sem : temp) {
            rsl.append(sem);
        }
        return rsl.toString();
    }
}
