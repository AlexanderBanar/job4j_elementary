package ru.job4j.max;

public class Abbreviation {
    public static String collect(String s) {
        String[] temp = s.split(" ");
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            rsl.append(temp[i].charAt(0));
        }
        return rsl.toString();
    }
}
