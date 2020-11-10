package ru.job4j.tasks2;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result += words[i];
            } else {
                result += " " + words[i];
            }
        }
        return result;
    }
}
