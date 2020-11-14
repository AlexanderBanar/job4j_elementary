package ru.job4j.tasks2;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        int counter = 0;
        String status = "initial";
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c && !status.equals("started")) {
                status = "started";
            }
            if (str[i] == c && status.equals("started")) {
                status = "initial";
                counter++;
            }
            if (str[i] != c && i == str.length - 1) {
                counter++;
            }
        }
        if (counter == 0) {
            char[][] result = new char[1][str.length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < str.length; j++) {
                    result[i][j] = str[j];
                }
            }
            return result;
        } else {
            char[][] rsl = new char[counter][];
            int startIndex = 0;
            int finishIndex = 0;
            int rslIndex = 0;
            status = "initial";
            for (int i = 0; i < str.length; i++) {
                if (str[i] != c && !status.equals("started")) {
                    status = "started";
                    startIndex = i;
                }
                if (str[i] == c && status.equals("started")) {
                    status = "initial";
                    finishIndex = i;
                    rsl[rslIndex++] = Arrays.copyOfRange(str, startIndex, finishIndex);
                }
                if (str[i] != c && i == str.length - 1 && status.equals("initial")) {
                    rsl[rslIndex] = new char[] {str[i]};

                }
                if (str[i] != c && i == str.length - 1 && status.equals("started")) {
                    rsl[rslIndex] = Arrays.copyOfRange(str, startIndex, i + 1);
                }
            }
            return rsl;
        }
    }
}
