package ru.job4j.tasks7;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier<String> supplier() {
        Supplier<String> supplier = String::new;
        return supplier;
    }
}
