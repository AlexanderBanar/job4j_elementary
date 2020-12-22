package ru.job4j.tasks7;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
        Predicate<Integer> predicate = x -> (x >= 0) && (x % 2 == 0);
        return check(predicate, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

}
