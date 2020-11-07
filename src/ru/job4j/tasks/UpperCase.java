package ru.job4j.tasks;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        char[] check = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
        for (int i = 0; i < string.length; i++) {
            innerLoop:
            for (int j = 0; j < check.length; j++) {
                if (string[i] != check[j]) {
                    continue innerLoop;
                } else {
                    rsl[i] = string[i];
                    break innerLoop;
                }
            }
            if (Character.isLowerCase(string[i])) {
                rsl[i] = Character.toUpperCase(string[i]);
            } else {
                rsl[i] = string[i];
            }
        }
        return rsl;
    }
}
