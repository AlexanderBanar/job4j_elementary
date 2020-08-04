package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if ((number == 1) || (number == 2)) {
            prime = false;
        } else {
            for (int check = 2; check <= (number - 1); check++) {
                if ((number % check) == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
