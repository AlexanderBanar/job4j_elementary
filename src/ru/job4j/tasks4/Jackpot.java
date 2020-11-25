package ru.job4j.tasks4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> winCheck = new HashSet<>();
        winCheck.addAll(Arrays.asList(combination));
        return winCheck.size() == 1;
    }
}
