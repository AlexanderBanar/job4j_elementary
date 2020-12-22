package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int change = money - price;
        while (change > 0) {
            index = change >= COINS[index] ? index : ++index;
            rsl[size++] = COINS[index];
            change = change - COINS[index];
        }
        return Arrays.copyOf(rsl, size);
    }
}
