package ru.job4j.tasks4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        boolean rsl = true;
        Set<String> temp = new HashSet<>(Arrays.asList(s.split(" ")));
        Set<String> copy = new HashSet<>(words);
        for (String n : temp) {
            rsl = copy.add(n);
            if (!rsl) {
                break;
            }
        }
        return (rsl) ? "Вы сделали правильный выбор!" : "Выберите другую статью...";
    }
}
