package ru.job4j.tasks7;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        String rsl = input;
        Consumer<String> print = input -> System.out.println();
        Consumer<String> ln = System.out::println;
        return print.andThen(ln);
    }
}
