package ru.job4j.casting;

public class Shuttle implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on highways");
    }
}
