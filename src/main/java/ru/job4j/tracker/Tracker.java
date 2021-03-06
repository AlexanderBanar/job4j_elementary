package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] resultWithNull = new Item[size];
        int counter = 0;
        for (int index = 0; index < size; index++) {
            Item sample = items[index];
            if (sample.getName().equals(key)) {
                resultWithNull[counter++] = sample;
            }
        }
        return Arrays.copyOf(resultWithNull, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int rsl = indexOf(id);
        if (rsl != -1) {
            items[rsl] = item;
            item.setId(id);
        }
        return rsl != -1 ? true : false;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size-- - 1] = null;
            rsl = true;
        }
        return rsl;
    }
}
