package ru.job4j.tasks;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + ((middle.length + right.length) / 2)];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        int counterM = 1;
        int counterR = 0;
        for (int i = 1; i < rsl.length - 1; i++) {
            if (i % 2 == 0) {
                rsl[i] = middle[counterM];
                counterM += 2;
            } else {
                rsl[i] = right[counterR];
                counterR += 2;
            }
        }
        return rsl;
    }
}
