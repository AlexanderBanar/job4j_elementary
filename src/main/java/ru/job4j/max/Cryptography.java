package ru.job4j.max;

public class Cryptography {
    public static String code(String s) {
        StringBuilder rsl = new StringBuilder(s);
        if (s.isEmpty()) {
            return "empty";
        }
        if (s.length() > 1 && s.length() <= 4) {
            return s;
        } else {
            for (int i = 0; i < s.length() - 4; i++) {
                rsl.setCharAt(i, '#');
            }
        }
        return rsl.toString();
    }
}
