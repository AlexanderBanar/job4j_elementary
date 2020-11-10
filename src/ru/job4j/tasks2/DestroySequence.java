package ru.job4j.tasks2;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; i++) {
            seq[i] = '0';
        }
        for (int j = seq.length - 5; j < seq.length; j++) {
            seq[j] = '1';
        }
        return seq;
    }
}
