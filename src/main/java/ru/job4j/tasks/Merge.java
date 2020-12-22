package ru.job4j.tasks;

/*
Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int posLef = 0;
        int posRig = 0;
        int posRsl = 0;
        while (posRsl < rsl.length) {
            if (posLef < left.length && posRig < right.length) {
                rsl[posRsl++] = (left[posLef] > right[posRig]) ? right[posRig++] : left[posLef++];
            } else {
                if (posLef < left.length) {
                    rsl[posRsl++] = left[posLef++];
                } else {
                    rsl[posRsl++] = right[posRig++];
                }
            }
        }
        return rsl;
    }
}
