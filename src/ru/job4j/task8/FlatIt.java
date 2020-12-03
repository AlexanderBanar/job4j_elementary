package ru.job4j.task8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
             Iterator<Integer> temp = it.next();
             while (temp.hasNext()) {
                 rsl.add(temp.next());
             }
        }
        return rsl;
    }
}
