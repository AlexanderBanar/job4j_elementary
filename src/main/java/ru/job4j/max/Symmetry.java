package ru.job4j.max;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String check = Integer.toString(i);
        int charsToCheck = check.length() / 2;
        for (int j = 0; j < charsToCheck; j++) {
            char left = check.charAt(j);
            char right = check.charAt(check.length() - 1 - j);
            if (left != right) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
