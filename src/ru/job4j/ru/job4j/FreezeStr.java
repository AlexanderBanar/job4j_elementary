package ru.job4j.ru.job4j;

import java.util.ArrayList;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = true;
        char[] leftAr = left.toCharArray();
        char[] rightAr = right.toCharArray();
        List<Character> check = new ArrayList<>();
        for (char temp : leftAr) {
            check.add(temp);
        }
        for (char control : rightAr) {
            if (!check.contains(control)) {
                rsl = false;
                break;
            } else {
                check.set(check.indexOf(control), ' ');
            }
        }
        return rsl;
    }
}
