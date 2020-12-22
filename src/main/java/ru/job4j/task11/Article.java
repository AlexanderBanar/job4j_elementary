package ru.job4j.task11;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originArray = origin.split("\\. |, |! |: |\\? |!|; | ");
        String[] lineArray = line.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String temp : originArray) {
            check.add(temp);
        }
        for (String control : lineArray) {
            if (!check.contains(control)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
