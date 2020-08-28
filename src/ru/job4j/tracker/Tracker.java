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
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] temp = Arrays.copyOf(items, size);
        Item[] resultWithNull = new Item[temp.length];
        int counter = 0;
        for (int index = 0; index < temp.length; index++) {
            Item sample = temp[index];
            if (sample != null) {
                resultWithNull[counter++] = sample;
            }
        }
        Item[] result = Arrays.copyOf(resultWithNull, counter);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] temp = Arrays.copyOf(items, size);
        Item[] resultWithNull = new Item[temp.length];
        int counter = 0;
        for (int index = 0; index < temp.length; index++) {
            Item sample = temp[index];
            if (sample.getName() == key) {
                resultWithNull[counter++] = sample;
            }
        }
        Item[] result = Arrays.copyOf(resultWithNull, counter);
        return result;
    }
}
