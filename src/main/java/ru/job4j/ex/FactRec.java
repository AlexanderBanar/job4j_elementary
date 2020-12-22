package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int correction = 0;
        if (n == 0 || n == 1) {
            correction = 1;
        } else {
            correction = calc(n - 1) * n;
        }
        return correction;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
