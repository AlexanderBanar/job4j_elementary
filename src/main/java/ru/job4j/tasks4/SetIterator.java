package ru.job4j.tasks4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<String>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
