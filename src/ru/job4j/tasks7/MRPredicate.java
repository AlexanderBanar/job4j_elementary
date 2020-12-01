package ru.job4j.tasks7;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
        Predicate<String> predicate = String::isEmpty;
        return predicate;
    }
}
