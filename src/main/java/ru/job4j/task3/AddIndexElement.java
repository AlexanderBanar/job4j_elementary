package ru.job4j.task3;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str) && !(index < 0) && !(index >= check.size()) ) {
            check.add(index, str);
        }
        return check.size() > list.size();
    }
}
