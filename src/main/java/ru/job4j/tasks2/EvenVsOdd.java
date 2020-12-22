package ru.job4j.tasks2;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else {
                sum2 += players[i];
            }
        }
        if (sum1 > sum2) {
            return 1;
        }
        if (sum1 < sum2) {
            return 2;
        }
        return 0;
    }
}
