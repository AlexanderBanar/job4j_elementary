package ru.job4j.casting;

public class Action {
    public static void main(String[] args) {
        Vehicle airbus = new Airbus();
        Vehicle shuttle = new Shuttle();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[] {airbus, shuttle, train};
        for (Vehicle temp : vehicles) {
            temp.move();
        }
    }
}
