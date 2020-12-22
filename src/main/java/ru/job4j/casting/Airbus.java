package ru.job4j.casting;

public class Airbus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves in the air");
    }
}
